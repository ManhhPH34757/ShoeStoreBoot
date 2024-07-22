package com.spring.shoestoreboot.repositories;

import com.spring.shoestoreboot.entities.Sizes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SizesRepository extends JpaRepository<Sizes, Integer> {
}