import time

import pika
import psycopg2
import pytesseract
from minio import Minio
from pdf2image import convert_from_bytes

from elastic_search_service import ElasticSearchService


def connect_to_rabbitmq(host, credentials):
    try:
        connection_params = pika.ConnectionParameters(
            host=host,
            credentials=credentials,
            connection_attempts=1,
            socket_timeout=2.0,
            stack_timeout=2.0
        )
        connection = pika.BlockingConnection(connection_params)
        print(f"Connected to {host}")
        return connection
    except Exception as e:
        print(f"Connection to {host} failed. Trying alternative.")
        connection_params_alternative = pika.ConnectionParameters(
            host='paperless-rabbitmq-standalone',
            credentials=credentials
        )
        connection_alternative = pika.BlockingConnection(connection_params_alternative)
        print(f"Connected to {host}-standalone")
        return connection_alternative


def connect_to_minio(endpoint, access_key, secret_key):
    try:
        minio_client = Minio(endpoint, access_key=access_key, secret_key=secret_key, secure=False)
        if not minio_client.bucket_exists("nonexistingbucket"):
            print(f"Connected to {endpoint}")
            return minio_client
    except Exception as e:
        print(f"Connection to {endpoint} failed. Trying alternative.")
        minio_endpoint_alternative = 'paperless-minio-standalone:9000'
        try:
            minio_client_alternative = Minio(minio_endpoint_alternative, access_key=access_key, secret_key=secret_key,
                                             secure=False)
            if not minio_client_alternative.bucket_exists("nonexistingbucket"):
                print(f"Connected to {minio_endpoint_alternative}")
                return minio_client_alternative
        except Exception as e:
            print(f"Connection to {minio_endpoint_alternative} failed.")
    print("Failed to connect to MinIO")
    return None


def connect_to_postgres(dbname, user, password, host, port):
    try:
        conn = psycopg2.connect(
            dbname=dbname,
            user=user,
            password=password,
            host=host,
            port=port
        )
        print(f"Connected to {host}")
        return conn
    except Exception as e:
        print(f"Connection to {host} failed. Trying alternative.")
        postgres_host_alternative = "paperless-postgres-standalone"
        try:
            conn_alternative = psycopg2.connect(
                dbname=dbname,
                user=user,
                password=password,
                host=postgres_host_alternative,
                port=port
            )
            print(f"Connected to {postgres_host_alternative}")
            return conn_alternative
        except Exception as e:
            print(f"Connection to {postgres_host_alternative} failed.")
    print("Failed to connect to PostgreSQL")
    return None


def add_to_elasticsearch(es_service, text, file_id):
    es_service.index_document({
        "id": file_id,
        "content": text
    })


def add_to_database(conn, text, file_id):
    cur = conn.cursor()

    sql = "UPDATE document SET content = %s WHERE id = %s;"

    cur.execute(sql, (text, file_id))

    # Commit the transaction
    conn.commit()

    # Close communication with the PostgreSQL database
    cur.close()


def process_file(minio_client, file_url, es_service, conn):
    bucket_name = file_url.split('/')[0]
    object_path = file_url.split('/')[1]
    file_id = object_path.split('.')[0]

    # Download the entire file
    file_data = minio_client.get_object(bucket_name, object_path)

    doc = convert_from_bytes(file_data.data)
    all_text = ""
    for page_number, page_data in enumerate(doc):
        txt = pytesseract.image_to_string(page_data, lang="deu")
        all_text += txt + "\n"

    add_to_database(conn, all_text, file_id)
    add_to_elasticsearch(es_service, all_text, file_id)


def callback(ch, method, properties, body, minio_client, es_service, postgres_conn):
    try:
        file_url = body.decode('utf-8')  # Get file path from the message
        print(file_url)
        process_file(minio_client, file_url, es_service, postgres_conn)
    except Exception as e:
        print(e)
        print("Error: Could not process file")


def main():
    print("Sleeping for 20 seconds to allow other containers to start...")
    time.sleep(20)

    es_service = ElasticSearchService()

    rabbitmq_host = 'paperless-rabbitmq'
    rabbitmq_credentials = pika.PlainCredentials('paperless', 'paperless')
    connection = connect_to_rabbitmq(rabbitmq_host, rabbitmq_credentials)

    if connection is None:
        print("Error: Could not connect to RabbitMQ")
        exit(1)

    channel = connection.channel()
    channel.queue_declare(queue='ORC_DOCUMENT_IN')

    minio_endpoint = 'paperless-minio:9000'
    access_key = 'paperless'
    secret_key = 'paperless'
    minio_client = connect_to_minio(minio_endpoint, access_key, secret_key)

    if minio_client is None:
        print("Error: Could not connect to MinIO")
        exit(1)

    postgres_conn = connect_to_postgres("paperless", "paperless", "paperless", "paperless-postgres", "5432")

    if postgres_conn is None:
        print("Error: Could not connect to PostgreSQL")
        exit(1)

    channel.basic_consume(
        queue='ORC_DOCUMENT_IN',
        on_message_callback=lambda ch, method, properties, body: callback(
            ch, method, properties, body, minio_client, es_service, postgres_conn
        ),
        auto_ack=True
    )

    print("Service started!")

    channel.start_consuming()


if __name__ == "__main__":
    main()
