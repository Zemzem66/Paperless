package com.paperless.persistence.repositories;

import com.paperless.persistence.entities.SavedView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SavedViewRepository extends JpaRepository<SavedView, Integer> {
}
