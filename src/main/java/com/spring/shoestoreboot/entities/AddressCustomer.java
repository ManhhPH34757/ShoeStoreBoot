package com.spring.shoestoreboot.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter
@Setter
@Entity
@Table(name = "address_customer")
public class AddressCustomer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "_id_address", nullable = false)
    private Integer id;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "_id_customer")
    private Customer idCustomer;

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

}