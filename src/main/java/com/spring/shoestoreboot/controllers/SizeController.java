package com.spring.shoestoreboot.controllers;

import com.spring.shoestoreboot.entities.Sizes;
import com.spring.shoestoreboot.repositories.SizesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sizes")
public class SizeController {

    @Autowired
    private SizesRepository sizesRepository;

    @GetMapping()
    public Iterable<Sizes> getAllSizes() {
        return sizesRepository.findAll();
    }
}
