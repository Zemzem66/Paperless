package com.paperless.persistence.entities;

import javax.persistence.*;
import java.util.Set;


@Entity
public class UserGroup {

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

    @Column(nullable = false, length = 150)
    private String name;

    @OneToMany(mappedBy = "group")
    private Set<UserGroups> groupUserGroups;

    @OneToMany(mappedBy = "group")
    private Set<GroupPermissions> groupGroupPermissions;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Set<UserGroups> getGroupAuthUserGroupses() {
        return groupUserGroups;
    }

    public void setGroupAuthUserGroupses(final Set<UserGroups> groupUserGroups) {
        this.groupUserGroups = groupUserGroups;
    }

    public Set<GroupPermissions> getGroupAuthGroupPermissionses() {
        return groupGroupPermissions;
    }

    public void setGroupAuthGroupPermissionses(
            final Set<GroupPermissions> groupGroupPermissions) {
        this.groupGroupPermissions = groupGroupPermissions;
    }

}
