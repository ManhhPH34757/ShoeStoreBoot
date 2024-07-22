package com.spring.shoestoreboot.services;

import com.spring.shoestoreboot.entities.ProductDetail;
import com.spring.shoestoreboot.repositories.ProductDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDetailService {

    @Autowired
    private ProductDetailRepository productDetailRepository;

    public Iterable<ProductDetail> getProductDetail() {
        return productDetailRepository.findAll();
    }

    public ProductDetail findById(Integer id) {
        return productDetailRepository.findById(id).orElse(null);
    }

    public ProductDetail update(ProductDetail productDetail) {
        return productDetailRepository.save(productDetail);
    }
}
