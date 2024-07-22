package com.spring.shoestoreboot.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
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
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "_id_orders", nullable = false)
    private Integer id;

    @Size(max = 20)
    @NotNull
    @Column(name = "_order_code", nullable = false, length = 20)
    private String orderCode;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "_id_customer")
    private Customer idCustomer;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "_id_admin")
    private Admin idAdmin;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "_id_coupons")
    private Coupon idCoupons;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "_id_pay")
    private Pay idPay;

    @Size(max = 100)
    @Nationalized
    @Column(name = "_customer_name", length = 100)
    private String customerName;

    @Size(max = 15)
    @Column(name = "_phone_number", length = 15)
    private String phoneNumber;

    @Size(max = 255)
    @Nationalized
    @Column(name = "_address")
    private String address;

    @Column(name = "_transport_price", precision = 38, scale = 5)
    private BigDecimal transportPrice;

    @Column(name = "_reduced_price", precision = 38, scale = 5)
    private BigDecimal reducedPrice;

    @Column(name = "_exchange_price", precision = 38, scale = 5)
    private BigDecimal exchangePrice;

    @Column(name = "_total_price", precision = 38, scale = 5)
    private BigDecimal totalPrice;

    @Column(name = "_total_payouts", precision = 38, scale = 5)
    private BigDecimal totalPayouts;

    @Size(max = 255)
    @Nationalized
    @Column(name = "_status")
    private String status;

    @Column(name = "_date_created")
    private Instant dateCreated;

    @Column(name = "_date_updated")
    private Instant dateUpdated;

    @Column(name = "_order_type")
    private String orderType;

}