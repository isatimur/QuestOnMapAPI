package ru.qom.api.dao.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.qom.api.dao.domain.Box;

import java.util.Collection;

public interface BoxRepository extends PagingAndSortingRepository<Box, Long> {
//    @Query("select b from box b where b.username=:username")
//    Collection<Box> findByUsername(@Param("username")String username);
    Collection<Box> findByAccountUsername(String username);
}