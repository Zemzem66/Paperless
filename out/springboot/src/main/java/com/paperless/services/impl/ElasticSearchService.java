package com.paperless.services.impl;


import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch._types.Result;
import co.elastic.clients.elasticsearch.core.DeleteResponse;
import co.elastic.clients.elasticsearch.core.GetResponse;
import co.elastic.clients.elasticsearch.core.IndexResponse;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.elasticsearch.core.search.Hit;
import co.elastic.clients.elasticsearch.core.search.HitsMetadata;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.paperless.configuration.ElasticSearchConfig;
import com.paperless.persistence.entities.Document;
import com.paperless.persistence.repositories.DocumentRepository;
import com.paperless.services.mapper.DocumentMapper;
import com.paperless.services.mapper.GetDocument200ResponseMapper;
import com.paperless.services.mapper.UpdateDocument200ResponseMapper;
import io.minio.MinioClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
@Slf4j
public class ElasticSearchService implements SearchIndexService {
    private final ElasticsearchClient esClient;
    private final DocumentRepository documentRepository;

    @Autowired
    public ElasticSearchService(ElasticsearchClient esClient, DocumentRepository documentRepository) throws IOException {
        this.esClient = esClient;
        this.documentRepository = documentRepository;
    }

    @Override
    public List<Document> searchDocument(String query) throws IOException {
        SearchResponse<ObjectNode> response = esClient.search(s -> s
                .index(ElasticSearchConfig.DOCUMENTS_INDEX_NAME)
                .size(1000)
                .query(q -> q.match(m -> m.field("content").query(query))),
                ObjectNode.class
        );

        assert response.hits().total() != null;
        if (response.hits().total().value() != 0) {
            log.info("Found {} documents", response.hits().total().value());
        } else {
            log.info("No documents found");
        }

        return extractDocuments(response.hits());
    }

    private List<Document> extractDocuments(HitsMetadata<ObjectNode> hitsMetadata) {
        List<ObjectNode> documents = new ArrayList<>();

        //get hits
        for (Hit<ObjectNode> hit : hitsMetadata.hits()) {
            documents.add(hit.source());
        }

        //extract ids
        List<Integer> documentIds = new ArrayList<>();
        for (ObjectNode document : documents) {
            documentIds.add(document.get("id").asInt());
        }

        //get documents from repository
        List<Document> documentEntities = new ArrayList<>();
        for (Integer documentId : documentIds) {
            Optional<Document> document = documentRepository.findById(documentId);
            document.ifPresent(documentEntities::add);
        }

        return documentEntities;
    }


}
