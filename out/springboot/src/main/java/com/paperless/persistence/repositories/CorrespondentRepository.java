package com.paperless.persistence.repositories;

import com.paperless.persistence.entities.Correspondent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
@Component
public interface CorrespondentRepository extends JpaRepository<Correspondent, Integer> {
}
