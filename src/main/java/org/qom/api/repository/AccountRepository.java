package org.qom.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.social.facebook.api.Account;

import java.util.Collection;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Collection<Account> findAllUsersByLogin(String title);
}

