package com.spring.shoestoreboot.controllers;

import com.spring.shoestoreboot.entities.Customer;
import com.spring.shoestoreboot.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping()
    public Iterable<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @GetMapping("/{phoneNumber}")
    public Customer getCustomerByPhoneNumber(@PathVariable String phoneNumber) {
        return customerRepository.findByPhoneNumber(phoneNumber);
    }

}
