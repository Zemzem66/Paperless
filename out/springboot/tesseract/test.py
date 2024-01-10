import unittest
from unittest.mock import patch, Mock, MagicMock

import pika

from script import (
    connect_to_rabbitmq,
    connect_to_postgres,
    add_to_elasticsearch,
    add_to_database, process_file, connect_to_minio,
)


class Test(unittest.TestCase):

    @patch('pika.BlockingConnection')
    def test_connect_to_rabbitmq(self, mock_connection):
        # Assume success on first try
        mock_connection.return_value = Mock()
        connection = connect_to_rabbitmq('some-host', pika.PlainCredentials('paperless', 'paperless'))
        self.assertIsNotNone(connection)

        # Assume failure on first try, success on alternative
        mock_connection.side_effect = [Exception("Connection failed"), Mock()]
        connection = connect_to_rabbitmq('some-host', pika.PlainCredentials('paperless', 'paperless'))
        self.assertIsNotNone(connection)

    @patch('script.Minio')  # Ensure this is the correct patch target
    def test_connect_to_minio(self, mock_Minio):
        # Create a mock Minio client
        mock_client = Mock()
        mock_client.bucket_exists.return_value = False
        mock_Minio.return_value = mock_client

        # Test successful connection
        client = connect_to_minio('some-endpoint', 'accesskey', 'secretkey')
        self.assertIsNotNone(client)

        # Test failed connection and successful fallback
        mock_Minio.side_effect = [Exception("Failed connection"), mock_client]
        client = connect_to_minio('some-endpoint', 'accesskey', 'secretkey')
        self.assertIsNotNone(client)

        # Test failed connection and failed fallback
        mock_Minio.side_effect = Exception("Failed connection")
        client = connect_to_minio('some-endpoint', 'accesskey', 'secretkey')
        self.assertIsNone(client)

    @patch('psycopg2.connect')
    def test_connect_to_postgres(self, mock_connect):
        # Assume success
        mock_connect.return_value = Mock()
        conn = connect_to_postgres('dbname', 'user', 'password', 'host', 'port')
        self.assertIsNotNone(conn)

        # Assume failure
        mock_connect.side_effect = Exception("Connection failed")
        conn = connect_to_postgres('dbname', 'user', 'password', 'host', 'port')
        self.assertIsNone(conn)

    def test_add_to_elasticsearch(self):
        # Mock ElasticsearchService and its index_document method
        mock_es_service = Mock()
        add_to_elasticsearch(mock_es_service, "some text", "123")

        # Ensure the index_document method was called with the right arguments
        mock_es_service.index_document.assert_called_with({
            "id": "123",
            "content": "some text"
        })

    @patch('psycopg2.connect')
    def test_add_to_database(self, mock_connect):
        # Mock connection and cursor
        mock_conn = mock_connect.return_value
        mock_cursor = Mock()
        mock_conn.cursor.return_value = mock_cursor

        add_to_database(mock_conn, "some text", "123")

        # Ensure the database commands were executed
        mock_cursor.execute.assert_called()
        mock_conn.commit.assert_called()
        mock_cursor.close.assert_called()

    @patch('script.add_to_elasticsearch')
    @patch('script.add_to_database')
    @patch('pytesseract.image_to_string', return_value='mocked text')
    @patch('script.convert_from_bytes', return_value=[MagicMock()])
    def test_process_file(self, mock_convert_from_bytes, mock_image_to_string, mock_add_to_database,
                          mock_add_to_elasticsearch):
        # Setup
        mock_minio_client = Mock()
        mock_es_service = Mock()
        mock_postgres_conn = Mock()

        file_url = "bucket_name/pdfpath.pdf"

        # Test
        process_file(mock_minio_client, file_url, mock_es_service, mock_postgres_conn)

        # Assert that the file was retrieved and processed
        mock_image_to_string.assert_called()
        mock_add_to_database.assert_called_with(mock_postgres_conn, 'mocked text\n', 'pdfpath')
        mock_add_to_elasticsearch.assert_called_with(mock_es_service, 'mocked text\n', 'pdfpath')


if __name__ == "__main__":
    unittest.main()
