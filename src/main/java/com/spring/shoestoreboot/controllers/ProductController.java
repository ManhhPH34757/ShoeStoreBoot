package com.spring.shoestoreboot.controllers;

import com.spring.shoestoreboot.dto.ProductDTO;
import com.spring.shoestoreboot.entities.Product;
import com.spring.shoestoreboot.exception.ResourceNotFoundException;
import com.spring.shoestoreboot.repositories.ProductDTORepository;
import com.spring.shoestoreboot.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductDTORepository productDTORepositoryRepository;

    @GetMapping()
    public Iterable<ProductDTO> getAllProducts() {

        return productDTORepositoryRepository.getAllProducts()
                .stream()
                .sorted(Comparator.comparing(ProductDTO::getId).reversed())
                .collect(Collectors.toList());
    }

    @PostMapping()
    public Product createProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Integer id) {
        return productRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Could not find product has id = " + id));
    }

    @PutMapping(value = "/{id}")
    public Product updateProduct(@PathVariable Integer id, @RequestBody Product updatedProduct) {
        Product product = productRepository.findById(id).orElse(null);
        if (product!= null) {
            updatedProduct.setId(id);
            System.out.println(updatedProduct);
            return productRepository.save(updatedProduct);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Integer id) {
        Product product = productRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Could not find product has id = " + id));
        productRepository.delete(product);
    }
}
