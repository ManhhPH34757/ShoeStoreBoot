package com.spring.shoestoreboot.controllers;

import com.spring.shoestoreboot.entities.Pay;
import com.spring.shoestoreboot.repositories.PayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pays")
public class PayController {

    @Autowired
    private PayRepository payRepository;

    @GetMapping()
    public Iterable<Pay> getAllPays() {
        return payRepository.findAll();
    }
}
