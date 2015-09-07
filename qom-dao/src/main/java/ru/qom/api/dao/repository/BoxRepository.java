package ru.qom.api.dao.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import ru.qom.api.dao.domain.Box;

import java.util.Collection;

public interface BoxRepository extends PagingAndSortingRepository<Box, Long> {
    @Query("select b from Box b where b.username=:username")
    Collection<Box> findByAccountUsername(@Param("username") String username);

}