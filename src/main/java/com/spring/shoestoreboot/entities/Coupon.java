package com.spring.shoestoreboot.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "coupons")
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "_id_coupons", nullable = false)
    private Integer id;

    @Size(max = 50)
    @NotNull
    @Column(name = "_coupons_code", nullable = false, length = 50)
    private String couponsCode;

    @Column(name = "_conditions", precision = 38, scale = 5)
    private BigDecimal conditions;

    @Column(name = "_coupons_price", precision = 38, scale = 5)
    private BigDecimal couponsPrice;

    @Column(name = "_quantity")
    private Integer quantity;

    @Column(name = "_date_created")
    private Instant dateCreated;

    @Column(name = "_deadline")
    private Instant deadline;

}