package org.qom.api.repository;

import org.springframework.data.geo.Box;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface BoxRepository extends JpaRepository<Box, Long> {
    Collection<Box> findAllBoxesByUsername(String username);
}