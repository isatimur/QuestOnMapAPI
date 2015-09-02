package org.qom.api.repository;

import org.qom.api.entities.BoxDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface BoxRepository extends JpaRepository<BoxDto, Long> {
    Collection<BoxDto> findAllBoxesByUsername(String username);
}