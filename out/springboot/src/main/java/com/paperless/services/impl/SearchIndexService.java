package com.paperless.services.impl;

import co.elastic.clients.elasticsearch._types.Result;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.paperless.persistence.entities.Document;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface SearchIndexService {
    List<Document>  searchDocument(String query) throws IOException ;

}
