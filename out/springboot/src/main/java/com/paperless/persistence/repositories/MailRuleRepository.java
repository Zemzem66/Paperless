package com.paperless.persistence.repositories;

import com.paperless.persistence.entities.MailRule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MailRuleRepository extends JpaRepository<MailRule, Integer> {
}
