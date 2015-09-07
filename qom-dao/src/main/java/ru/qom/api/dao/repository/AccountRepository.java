package ru.qom.api.dao.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import ru.qom.api.dao.domain.Account;

import java.util.Optional;

public interface AccountRepository extends PagingAndSortingRepository<Account, Long> {
    @Query("select a from Account a where a.username=:username")
    Optional<Account> findByUsername(@Param("username") String username);

}

