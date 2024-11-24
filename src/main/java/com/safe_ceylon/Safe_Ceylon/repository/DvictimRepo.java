package com.safe_ceylon.Safe_Ceylon.repository;


import com.safe_ceylon.Safe_Ceylon.entity.Dvictim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface DvictimRepo extends JpaRepository<Dvictim, Integer> {

}
