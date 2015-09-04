package org.qom.api.dao.repository;

import org.qom.api.dao.domain.Account;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface AccountRepository extends PagingAndSortingRepository<Account, Long> {

    Optional<Account> findByUsername(String username);


}

