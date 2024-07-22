package com.spring.shoestoreboot.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "_id_cart", nullable = false)
    private Integer id;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "_id_customer")
    private Customer idCustomer;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "_id_product_details")
    private ProductDetail idProductDetails;

    @Column(name = "_quantity")
    private Integer quantity;

    @Column(name = "_date_created")
    private Instant dateCreated;

    @Column(name = "_date_updated")
    private Instant dateUpdated;

}