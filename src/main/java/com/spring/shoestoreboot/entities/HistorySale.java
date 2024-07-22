package com.spring.shoestoreboot.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "history_sale")
public class HistorySale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "_id_history_sale", nullable = false)
    private Integer id;

    @Column(name = "_id_product_details")
    private Integer idProductDetails;

    @Column(name = "_id_sale")
    private Integer idSale;

}