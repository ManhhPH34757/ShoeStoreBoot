package com.spring.shoestoreboot.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "order_details")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "_id_order_details", nullable = false)
    private Integer id;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "_id_product_details")
    private ProductDetail idProductDetails;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "_id_orders")
    private Order idOrders;

    @Column(name = "_quantity")
    private Integer quantity;

    @Column(name = "_total_price", precision = 38, scale = 5)
    private BigDecimal totalPrice;

    @Size(max = 255)
    @Nationalized
    @Column(name = "_status")
    private String status;

    @Size(max = 255)
    @Nationalized
    @Column(name = "_product_status")
    private String productStatus;

}