package com.spring.shoestoreboot.repositories;

import com.spring.shoestoreboot.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Customer findByPhoneNumber(String phoneNumber);
}