package com.spring.shoestoreboot.repositories;

import com.spring.shoestoreboot.entities.Sole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoleRepository extends JpaRepository<Sole, Integer> {
}