package com.spring.shoestoreboot.repositories;

import com.spring.shoestoreboot.entities.Pay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayRepository extends JpaRepository<Pay, Integer> {
}