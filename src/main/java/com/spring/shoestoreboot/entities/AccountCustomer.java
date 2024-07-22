package com.spring.shoestoreboot.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter
@Setter
@Entity
@Table(name = "account_customer")
public class AccountCustomer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "_id_account_customer", nullable = false)
    private Integer id;

    @NotNull
    @OneToOne(fetch = FetchType.EAGER, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "_id_customer", nullable = false)
    private Customer idCustomer;

    @Size(max = 50)
    @Column(name = "_user_name", length = 50)
    private String userName;

    @Column(name = "_password")
    private byte[] password;

    @Column(name = "_accumulated_points")
    private Long accumulatedPoints;

    @Size(max = 255)
    @Nationalized
    @Column(name = "_status")
    private String status;

}