from elasticsearch import Elasticsearch

class ElasticSearchService:
    def __init__(self):

        try:
            print("Trying to connect to paperless-elasticsearch:9200")
            self.es = Elasticsearch(["http://paperless-elasticsearch:9200"], basic_auth=('elastic', 'paperless'))

            if not self.es.indices.exists(index="paperless-index"):
                self.es.indices.create(index="paperless-index")
        except Exception as e:
            print("Connection to paperless-elasticsearch:9200 failed, paperless-elasticsearch-standalone:9200")
            self.es = Elasticsearch(["http://paperless-elasticsearch-standalone:9200"],
                                    basic_auth=('elastic', 'paperless'))
            print("paperless-elasticsearch-standalone:9200")

            if not self.es.indices.exists(index="paperless-index"):
                self.es.indices.create(index="paperless-index")

    def index_document(self, document):
        try:
            response = self.es.index(
                index="paperless-index",
                id=document["id"],
                body=document
            )

            log_msg = f"Indexed document {document['id']}: result={response['result']}, index={response['_index']}"
            if response['result'] not in ['created', 'updated']:
                print(f"Failed to {log_msg}")
            else:
                print(log_msg)

            return response['result']

        except Exception as e:
            print(f"Failed to index document {document['id']}: {e}")
            return None

    def get_document_by_id(self, doc_id):
        try:
            response = self.es.get(
                index="paperless-index",
                id=str(doc_id)
            )

            if 'found' in response and response['found'] and '_source' in response and response['_source']:
                return response['_source']
            else:
                return None

        except Exception as e:
            print(f"Failed to get document id={doc_id} from Elasticsearch: {e}")
            return None

    def delete_document_by_id(self, doc_id):
        try:
            response = self.es.delete(
                index="paperless-index",
                id=str(doc_id)
            )

            if 'result' in response and response['result'] == 'deleted':
                return True
            else:
                print(response)
                return False

        except Exception as e:
            print(f"Failed to delete document id={doc_id} from Elasticsearch: {e}")
            return False
