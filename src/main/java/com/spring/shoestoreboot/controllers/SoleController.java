package com.spring.shoestoreboot.controllers;

import com.spring.shoestoreboot.entities.Sole;
import com.spring.shoestoreboot.repositories.SoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/soles")
public class SoleController {

    @Autowired
    private SoleRepository soleRepository;

    @GetMapping()
    public Iterable<Sole> getAllSole() {
        return soleRepository.findAll();
    }

    @GetMapping("/{id}")
    public Sole getSoleById(@PathVariable Integer id) {
        return soleRepository.findById(id).orElse(null);
    }

}
