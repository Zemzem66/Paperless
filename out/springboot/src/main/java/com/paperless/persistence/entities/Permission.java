package com.paperless.persistence.entities;

import lombok.Getter;

import javax.persistence.*;
import java.util.Set;


@Entity
@Getter
public class Permission {

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

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, length = 100)
    private String contentType;

    @Column(nullable = false, length = 100)
    private String codename;

    @OneToMany(mappedBy = "permission")
    private Set<GroupPermissions> permissionGroupPermissions;

    @OneToMany(mappedBy = "permission")
    private Set<UserPermissions> permissionUserPermissions;

    public void setId(final Integer id) {
        this.id = id;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setContentType(final String contentType) {
        this.contentType = contentType;
    }

    public void setCodename(final String codename) {
        this.codename = codename;
    }

    public void setPermissionGroupPermissions(
            final Set<GroupPermissions> permissionGroupPermissions) {
        this.permissionGroupPermissions = permissionGroupPermissions;
    }

    public void setPermissionUserPermissions(
            final Set<UserPermissions> permissionUserPermissions) {
        this.permissionUserPermissions = permissionUserPermissions;
    }

}
