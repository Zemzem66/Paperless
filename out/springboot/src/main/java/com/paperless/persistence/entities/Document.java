package com.paperless.persistence.entities;

import com.paperless.services.dto.update.UpdateDocumentRequest;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.Set;


@Getter
@Setter
@Entity
public class Document {

    @Id
    @Column(nullable = false, updatable = false)
    @SequenceGenerator(
            name = "primary_sequence",
            sequenceName = "primary_sequence",
            allocationSize = 1,
            initialValue = 10000
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "primary_sequence"
    )
    private Integer id;

    @Column(nullable = false, length = 128)
    private String title;

    @Column(nullable = false, columnDefinition = "text")
    private String content;

    @Column(nullable = false)
    private OffsetDateTime created;

    @Column(nullable = false)
    private OffsetDateTime modified;

    @Column(nullable = false, length = 32)
    private String checksum;

    @Column(nullable = false)
    private OffsetDateTime added;

    @Column(nullable = false, length = 11)
    private String storageType;

    @Column(length = 1024)
    private String filename;

    @Column
    private Integer archiveSerialNumber;

    @Column(nullable = false, length = 256)
    private String mimeType;

    @Column(length = 32)
    private String archiveChecksum;

    @Column(length = 1024)
    private String archivedFileName;

    @Column(length = 1024)
    private String originalFileName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "correspondent_id")
    private Correspondent correspondent;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "document_type_id")
    private DocumentType documentType;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "storage_path_id")
    private StoragePath storagePath;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    private AuthUser owner;

    @OneToMany(mappedBy = "document")
    private Set<DocumentsNote> notes;

    @OneToMany(mappedBy = "document")
    private Set<DocumentTags> tags;

    public void setNotes(final Set<DocumentsNote> notes) {
        this.notes = notes;
    }

    public void setTags(
            final Set<DocumentTags> tags) {
        this.tags = tags;
    }

    public void updateByUpdateDocumentRequest (UpdateDocumentRequest update) {
        setTitle(update.getTitle());
        setContent(update.getContent());
        setArchiveSerialNumber(update.getArchiveSerialNumber());
        setCreated(OffsetDateTime.parse(update.getCreatedDate()));
        setModified(OffsetDateTime.parse(update.getModified()));
        setAdded(OffsetDateTime.parse(update.getAdded()));
        setArchivedFileName(update.getArchivedFileName());
        setOriginalFileName(update.getOriginalFileName());
    }

}
