package com.paperless.persistence.entities;

import lombok.Getter;

import javax.persistence.*;
import java.time.OffsetDateTime;


@Getter
@Entity
public class DocumentsNote {

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

    @Column(nullable = false, columnDefinition = "text")
    private String note;

    @Column(nullable = false)
    private OffsetDateTime created;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "document_id")
    private Document document;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private AuthUser user;

    public void setId(final Integer id) {
        this.id = id;
    }

    public void setNote(final String note) {
        this.note = note;
    }

    public void setCreated(final OffsetDateTime created) {
        this.created = created;
    }

    public void setDocument(final Document document) {
        this.document = document;
    }

    public void setUser(final AuthUser user) {
        this.user = user;
    }

}
