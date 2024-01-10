package com.paperless.persistence.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.time.OffsetDateTime;
import java.util.Set;

@Getter
@Setter
@Entity
public class AuthUser {

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

    @NotNull(message = "Password is required")
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,20}$", message = "Password must be between 8 and 20 characters long and contain at least one number, one uppercase letter, one lowercase letter and one special character")
    @Column(nullable = false, length = 128)
    private String password;

    @Column
    private OffsetDateTime lastLogin;

    @Column(nullable = false)
    private Boolean isSuperuser;

    @NotNull(message = "Username is required")
    @Size(min = 5, message = "Username must be at least 5 characters long")
    @Size(max = 20, message = "Username can not be longer than 20 characters")
    @Column(nullable = false, length = 150)
    private String username;

    @NotNull(message = "First name is required")
    @Size(min = 2, message = "First name must be at least 2 characters long")
    @Size(max = 150, message = "First name can not be longer than 150 characters")
    @Column(nullable = false, length = 150)
    private String firstName;

    @NotNull(message = "Last name is required")
    @Size(min = 2, message = "Last name must be at least 2 characters long")
    @Size(max = 150, message = "Last name can not be longer than 150 characters")
    @Column(nullable = false, length = 150)
    private String lastName;

    //check if pattern is an email address
    @Email(message = "Email must be a valid email address")
    @Column(nullable = false, length = 254)
    private String email;

    @Column(nullable = false)
    private Boolean isStaff;

    @Column(nullable = false)
    private Boolean isActive;

    @Column(nullable = false)
    private OffsetDateTime dateJoined;

    @OneToMany(mappedBy = "user")
    private Set<UserGroups> userGroups;

    @OneToMany(mappedBy = "owner")
    private Set<Correspondent> correspondents;

    @OneToMany(mappedBy = "owner")
    private Set<DocumentType> documentTypes;

    @OneToMany(mappedBy = "owner")
    private Set<StoragePath> storagePaths;

    @OneToMany(mappedBy = "owner")
    private Set<DocumentsTag> documentsTags;

    @OneToMany(mappedBy = "user")
    private Set<UiSettings> uiSettings;

    @OneToMany(mappedBy = "owner")
    private Set<SavedView> savedViews;

    @OneToMany(mappedBy = "owner")
    private Set<MailAccount> mailAccounts;

    @OneToMany(mappedBy = "owner")
    private Set<Document> documents;

    @OneToMany(mappedBy = "user")
    private Set<DocumentsNote> documentsNotes;

    @OneToMany(mappedBy = "owner")
    private Set<MailRule> mailRules;

    @OneToMany(mappedBy = "user")
    private Set<UserPermissions> userPermissions;

    @OneToMany(mappedBy = "user")
    private Set<AuthToken> authTokens;

    @OneToMany(mappedBy = "owner")
    private Set<ProcessedMail> processedMails;
}
