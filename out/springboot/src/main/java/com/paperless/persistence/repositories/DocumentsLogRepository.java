package com.paperless.persistence.repositories;

import com.paperless.persistence.entities.DocumentsLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentsLogRepository extends JpaRepository<DocumentsLog, Integer> {
}
