package com.paperless.persistence.repositories;

import com.paperless.persistence.entities.MailRuleAssignTags;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MailRuleAssignTagsRepository extends JpaRepository<MailRuleAssignTags, Integer> {
}
