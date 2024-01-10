package com.paperless.persistence.repositories;

import com.paperless.persistence.entities.StoragePath;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoragePathRepository extends JpaRepository<StoragePath, Integer> {
}
