package com.safe_ceylon.Safe_Ceylon.repository;

import com.safe_ceylon.Safe_Ceylon.entity.MDOfficer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface MDOfficerRepo extends JpaRepository<MDOfficer, Long> {
}