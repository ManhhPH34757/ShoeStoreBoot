package com.spring.shoestoreboot.controllers;

import com.spring.shoestoreboot.entities.Brand;
import com.spring.shoestoreboot.repositories.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/brands")
public class BrandController {

    @Autowired
    private BrandRepository brandRepository;

    @GetMapping()
    public Iterable<Brand> getAllBrands() {
        return brandRepository.findAll();
    }

    @GetMapping("/{id}")
    public Brand getBrandById(@PathVariable Integer id) {
        return brandRepository.findById(id).orElse(null);
    }

}
