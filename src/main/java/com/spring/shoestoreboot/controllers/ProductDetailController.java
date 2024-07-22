package com.spring.shoestoreboot.controllers;

import com.spring.shoestoreboot.entities.ProductDetail;
import com.spring.shoestoreboot.services.ProductDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product-details")
public class ProductDetailController {

    @Autowired
    private ProductDetailService productDetailService;

    @GetMapping()
    public Iterable<ProductDetail> getAllProductDetails() {
        return productDetailService.getProductDetail();
    }

    @GetMapping("/{id}")
    public ProductDetail getProductDetailById(@PathVariable Integer id) {
        return productDetailService.findById(id);
    }

    @PutMapping("/{id}")
    public ProductDetail updateProductDetail(@PathVariable Integer id, @RequestBody ProductDetail productDetail) {
        productDetail.setId(id);
        return productDetailService.update(productDetail);
    }

}
