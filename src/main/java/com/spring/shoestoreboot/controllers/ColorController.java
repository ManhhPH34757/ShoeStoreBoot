package com.spring.shoestoreboot.controllers;

import com.spring.shoestoreboot.entities.Color;
import com.spring.shoestoreboot.repositories.ColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/colors")
public class ColorController {

    @Autowired
    private ColorRepository colorRepository;

    @GetMapping()
    public Iterable<Color> getAllColors() {
        return colorRepository.findAll();
    }

}
