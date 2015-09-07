package ru.qom.api.dao.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import ru.qom.api.dao.domain.AccountDetails;

import java.util.Collection;
import java.util.Optional;

/**
 * Created by Тимакс on 06.09.2015.
 */
public interface AccountDetailsRepository extends PagingAndSortingRepository<AccountDetails, Long> {
    @Query("select d from AccountDetails d where d.id = :accountId")
    Collection<AccountDetails> getAccountInfos(@Param("accountId") Long accountId);

    @Query("select d from AccountDetails d where d.id = :accountId and d.name = :name")
    Optional<AccountDetails> getAccountInfo(@Param("accountId") Long accountId, @Param("name") String name);
}
