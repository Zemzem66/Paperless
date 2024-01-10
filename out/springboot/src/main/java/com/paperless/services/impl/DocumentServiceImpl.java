package com.paperless.services.impl;

import com.paperless.persistence.entities.Document;
import com.paperless.persistence.entities.StoragePath;
import com.paperless.persistence.repositories.DocumentRepository;
import com.paperless.services.dto.DocumentDTO;
import com.paperless.services.dto.okresponse.GetDocument200Response;
import com.paperless.services.dto.okresponse.GetDocuments200Response;
import com.paperless.services.dto.okresponse.UpdateDocument200Response;
import com.paperless.services.dto.update.UpdateDocumentRequest;
import com.paperless.services.mapper.DocumentMapper;
import com.paperless.services.mapper.GetDocument200ResponseMapper;
import com.paperless.services.mapper.UpdateDocument200ResponseMapper;
import io.minio.MinioClient;
import io.minio.PutObjectArgs;
import io.minio.errors.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Service
@Slf4j
public class DocumentServiceImpl implements DocumentService {

    private final DocumentRepository documentRepository;
    private final DocumentMapper documentMapper;
    private final GetDocument200ResponseMapper getDocument200ResponseMapper;
    private final UpdateDocument200ResponseMapper updateDocument200ResponseMapper;
    private final ElasticSearchService elasticSearchService;

    private final MinioClient minioClient;

    private final RabbitMQSender rabbitMQSender;


    @Value("${minio.bucketName}")
    private String bucketName;


    @Autowired
    public DocumentServiceImpl(DocumentRepository documentRepository, DocumentMapper documentMapper, GetDocument200ResponseMapper getDocument200ResponseMapper, UpdateDocument200ResponseMapper updateDocument200ResponseMapper, MinioClient minioClient, RabbitMQSender rabbitMQSender, ElasticSearchService elasticSearchService) {
        this.documentRepository = documentRepository;
        this.documentMapper = documentMapper;
        this.getDocument200ResponseMapper = getDocument200ResponseMapper;
        this.updateDocument200ResponseMapper = updateDocument200ResponseMapper;
        this.minioClient = minioClient;
        this.rabbitMQSender = rabbitMQSender;
        this.elasticSearchService = elasticSearchService;
    }

    @Override
    public GetDocument200Response getDocument(Integer id, Integer page, Boolean fullPerms) {
        Document foundEntity =  documentRepository.getReferenceById(id);
        return getDocument200ResponseMapper.entityToDto(foundEntity);
    }


    @Override
    public void uploadDocument(DocumentDTO documentDTO, MultipartFile file) {
        // TODO: document variable is unused yet

        documentDTO.setCreated(OffsetDateTime.now());
        documentDTO.setAdded(OffsetDateTime.now());
        documentDTO.setModified(OffsetDateTime.now());
        documentDTO.content("");
        documentDTO.setAdded(OffsetDateTime.now());


        Document documentToBeSaved = documentMapper.dtoToEntity(documentDTO);

        documentToBeSaved.setChecksum("checksum");
        documentToBeSaved.setStorageType("pdf");
        documentToBeSaved.setMimeType("pdf");

        documentRepository.save(documentToBeSaved);

        String objectName = documentToBeSaved.getId() + getFileExtension(Objects.requireNonNull(file.getOriginalFilename()));

        try {
            minioClient.putObject(
                    PutObjectArgs.builder()
                            .bucket(bucketName)
                            .object(objectName)
                            .stream(file.getInputStream(), file.getSize(), -1)
                            .contentType(file.getContentType())
                            .build()
            );
        } catch (ErrorResponseException | InsufficientDataException | InternalException | InvalidKeyException | InvalidResponseException | IOException | NoSuchAlgorithmException | ServerException | XmlParserException e) {
            log.error("Error while uploading file to Minio.");
            throw new RuntimeException(e);
        }

        StoragePath pathToFile = new StoragePath();
        pathToFile.setPath(bucketName + "/" + objectName);
        pathToFile.setName(file.getOriginalFilename());
        pathToFile.setMatch("");
        pathToFile.setMatchingAlgorithm(0);
        pathToFile.setIsInsensitive(false);

        documentToBeSaved.setStoragePath(pathToFile);

        rabbitMQSender.sendToOcrDocumentInQueue(documentToBeSaved.getStoragePath().getPath());

        log.info("Document saved and added to Queue.");

        documentRepository.save(documentToBeSaved);
    }


    @Override
    public ResponseEntity<GetDocuments200Response> getDocuments(Integer page, Integer pageSize, String query, String ordering, List<Integer> tagsIdAll, Integer documentTypeId, Integer storagePathIdIn, Integer correspondentId, Boolean truncateContent) throws IOException {
        List<DocumentDTO> documentDTOS = new ArrayList<>();

        if(query == null || query.isEmpty()) {
            for (Document document : documentRepository.findAll()) {
                documentDTOS.add(documentMapper.entityToDto(document));
            }
        } else {
            //search with elasticsearch
            for (Document document : elasticSearchService.searchDocument(query)) {
                documentDTOS.add(documentMapper.entityToDto(document));
            }
        }



        GetDocuments200Response sampleResponse = new GetDocuments200Response();
        sampleResponse.setCount(100);
        sampleResponse.setNext(1);
        sampleResponse.setPrevious(1);
        sampleResponse.addAllItem(1);

        for(DocumentDTO documentDTO : documentDTOS) {
            sampleResponse.addResultsItem(documentDTO.toGetDocuments200ResponseResultsInner());
        }

        return ResponseEntity.ok(sampleResponse);
    }

    @Override
    public ResponseEntity<UpdateDocument200Response> updateDocument(Integer id, UpdateDocumentRequest updateDocumentRequest) {
        Document document = documentRepository.getReferenceById(id);

        document.updateByUpdateDocumentRequest(updateDocumentRequest);

        documentRepository.save(document);

        UpdateDocument200Response updateDocument200Response = updateDocument200ResponseMapper.entityToDto(document);

        return ResponseEntity.ok(updateDocument200Response);
    }

    private String generateRandomName() {
        return UUID.randomUUID().toString();
    }

    private String getFileExtension(String filename) {
        int lastDotIndex = filename.lastIndexOf(".");
        return (lastDotIndex != -1) ? filename.substring(lastDotIndex) : "";
    }

}
