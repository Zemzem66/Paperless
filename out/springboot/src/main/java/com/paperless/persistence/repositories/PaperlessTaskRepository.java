package com.paperless.persistence.repositories;

import com.paperless.persistence.entities.PaperlessTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaperlessTaskRepository extends JpaRepository<PaperlessTask, Integer> {
}
