package com.paperless.persistence.entities;

import javax.persistence.*;


@Entity
public class MailRuleAssignTags {

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mailrule_id", nullable = false)
    private MailRule mailrule;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tag_id", nullable = false)
    private DocumentsTag tag;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public MailRule getMailrule() {
        return mailrule;
    }

    public void setMailrule(final MailRule mailrule) {
        this.mailrule = mailrule;
    }

    public DocumentsTag getTag() {
        return tag;
    }

    public void setTag(final DocumentsTag tag) {
        this.tag = tag;
    }

}
