package com.spring.shoestoreboot.repositories;

import com.spring.shoestoreboot.entities.AccountAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountAdminRepository extends JpaRepository<AccountAdmin, Integer> {

}