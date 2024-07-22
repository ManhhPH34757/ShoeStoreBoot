package com.spring.shoestoreboot.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
public class ProductDTO {
    @Id
    private Integer id;
    private String product_code;
    private String product_name;
    private String brand_name;
    private String category_name;
    private String sole_name;
    private String material_name;
    private Instant date_created;
    private Instant date_updated;
    private Integer quantity;

}
