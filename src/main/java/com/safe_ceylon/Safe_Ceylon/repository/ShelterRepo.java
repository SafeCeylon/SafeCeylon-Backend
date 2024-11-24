package com.safe_ceylon.Safe_Ceylon.repository;


import com.safe_ceylon.Safe_Ceylon.entity.Shelter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface ShelterRepo extends JpaRepository<Shelter, Integer> {

}
