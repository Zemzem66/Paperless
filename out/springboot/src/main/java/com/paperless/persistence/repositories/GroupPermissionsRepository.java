package com.paperless.persistence.repositories;

import com.paperless.persistence.entities.GroupPermissions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupPermissionsRepository extends JpaRepository<GroupPermissions, Integer> {
}
