package org.qom.api.dao.repository;

import org.qom.api.dao.domain.Box;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Collection;

public interface BoxRepository extends PagingAndSortingRepository<Box, Long> {
//    @Query("select b from box b where b.username=:username")
//    Collection<Box> findByUsername(@Param("username")String username);
    Collection<Box> findByAccountUsername(String username);
}