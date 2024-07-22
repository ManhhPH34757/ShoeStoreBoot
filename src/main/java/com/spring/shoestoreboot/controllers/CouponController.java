package com.spring.shoestoreboot.controllers;

import com.spring.shoestoreboot.entities.Coupon;
import com.spring.shoestoreboot.repositories.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/coupons")
public class CouponController {

    @Autowired
    private CouponRepository couponRepository;

    @GetMapping()
    public Iterable<Coupon> getAllCoupons() {
        return couponRepository.findAll();
    }
}
