package com.spring.shoestoreboot.controllers;

import com.spring.shoestoreboot.entities.Material;
import com.spring.shoestoreboot.repositories.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/materials")
public class MaterialController {

    @Autowired
    private MaterialRepository materialRepository;

    @GetMapping()
    public Iterable<Material> getAllMaterials() {
        return materialRepository.findAll();
    }

    @GetMapping("/{id}")
    public Material getMaterialById(@PathVariable Integer id) {
        return materialRepository.findById(id).orElse(null);
    }
}
