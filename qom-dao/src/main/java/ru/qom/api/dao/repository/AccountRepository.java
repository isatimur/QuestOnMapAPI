package ru.qom.api.dao.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.qom.api.dao.domain.Account;

import java.util.Optional;

public interface AccountRepository extends PagingAndSortingRepository<Account, Long> {

    Optional<Account> findByUsername(String username);


}

