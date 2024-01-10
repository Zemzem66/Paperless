package com.paperless.services.mapper;

import com.paperless.persistence.entities.*;
import com.paperless.persistence.repositories.*;
import com.paperless.services.dto.DocumentDTO;
import com.paperless.services.mapper.DocumentMapperImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.openapitools.jackson.nullable.JsonNullable;

import java.util.Collections;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class})
public class DocumentMapperTests {

    @Mock
    private CorrespondentRepository correspondentRepository;
    @Mock
    private DocumentTypeRepository documentTypeRepository;
    @Mock
    private StoragePathRepository storagePathRepository;
    @Mock
    private DocumentTagsRepository documentTagsRepository;

    @InjectMocks
    DocumentMapperImpl documentMapper;

    @Test
    @DisplayName("Map DTO to entity")
    public void testDtoToEntity() {

        // Create a sample DocumentDTO
        DocumentDTO documentDTO = new DocumentDTO();
        documentDTO.setId(1);
        documentDTO.setArchiveSerialNumber(JsonNullable.of("1"));
        documentDTO.setCorrespondent(JsonNullable.of(1));
        documentDTO.setDocumentType(JsonNullable.of(2));
        documentDTO.setStoragePath(JsonNullable.of(3));
        documentDTO.setTags(JsonNullable.of(Collections.singletonList(4)));

        // Mock repository responses
        Correspondent correspondent = new Correspondent();
        correspondent.setId(1);
        DocumentType documentType = new DocumentType();
        documentType.setId(2);
        StoragePath storagePath = new StoragePath();
        storagePath.setId(3);
        DocumentTags documentTags = new DocumentTags();
        documentTags.setId(4);


        Mockito.when(correspondentRepository.findById(1)).thenReturn(java.util.Optional.of(correspondent));
        Mockito.when(documentTypeRepository.findById(2)).thenReturn(java.util.Optional.of(documentType));
        Mockito.when(storagePathRepository.findById(3)).thenReturn(java.util.Optional.of(storagePath));
        Mockito.when(documentTagsRepository.findAllById(Collections.singletonList(4))).thenReturn(Collections.singletonList(documentTags));

        Document document = documentMapper.dtoToEntity(documentDTO);

        // Assert that the entity is correctly mapped
        assertEquals(correspondent, document.getCorrespondent());
        assertEquals(documentType, document.getDocumentType());
        assertEquals(storagePath, document.getStoragePath());
        assertEquals(Collections.singleton(documentTags), document.getTags());
    }

    @Test
    @DisplayName("Map entity to DTO")
    public void testEntityToDto() {
        // Create a sample Document entity
        Document document = new Document();
        Correspondent correspondent = new Correspondent();
        correspondent.setId(1);
        DocumentType documentType = new DocumentType();
        documentType.setId(2);
        StoragePath storagePath = new StoragePath();
        storagePath.setId(3);
        DocumentTags documentTags = new DocumentTags();
        documentTags.setId(4);
        AuthUser authUser = new AuthUser();
        authUser.setId(5);
        document.setCorrespondent(correspondent);
        document.setDocumentType(documentType);
        document.setStoragePath(storagePath);
        document.setOwner(authUser);
        document.setTags(new HashSet<>(Collections.singletonList(documentTags)));

        DocumentDTO documentDTO = documentMapper.entityToDto(document);

        // Assert that the DTO is correctly mapped
        assertEquals(JsonNullable.of(1), documentDTO.getCorrespondent());
        assertEquals(JsonNullable.of(2), documentDTO.getDocumentType());
        assertEquals(JsonNullable.of(3), documentDTO.getStoragePath());
        assertEquals(JsonNullable.of(Collections.singletonList(4)), documentDTO.getTags());
    }
}
