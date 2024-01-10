package com.paperless.persistence.repositories;

import com.paperless.persistence.entities.MailAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MailAccountRepository extends JpaRepository<MailAccount, Integer> {
}
