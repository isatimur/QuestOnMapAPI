package org.qom.api.repository;

import org.qom.api.entities.AccountDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface AccountRepository extends JpaRepository<AccountDto, Long> {
    Collection<AccountDto> findAllUsersByLogin(String title);
}

