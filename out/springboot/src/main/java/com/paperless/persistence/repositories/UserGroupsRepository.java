package com.paperless.persistence.repositories;

import com.paperless.persistence.entities.UserGroups;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserGroupsRepository extends JpaRepository<UserGroups, Integer> {
}
