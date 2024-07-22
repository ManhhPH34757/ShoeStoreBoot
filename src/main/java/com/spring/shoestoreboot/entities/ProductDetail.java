package com.spring.shoestoreboot.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "product_details")
public class ProductDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "_id_product_details", nullable = false)
    private Integer id;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "_id_product")
    private Product idProduct;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "_id_color")
    private Color idColor;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "_id_size")
    private Sizes idSize;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "_id_sale")
    private Sale idSale;

    @Column(name = "_price_old", precision = 38, scale = 5)
    private BigDecimal priceOld;

    @Column(name = "_price_new", precision = 38, scale = 5)
    private BigDecimal priceNew;

    @Column(name = "_quantity")
    private Integer quantity;

    @Size(max = 255)
    @Nationalized
    @Column(name = "_status")
    private String status;

    @Column(name = "_date_created")
    private Instant dateCreated;

    @Column(name = "_date_updated")
    private Instant dateUpdated;

}