package com.spring.shoestoreboot.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@Entity
@Table(name = "pay")
public class Pay {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "_id_pay", nullable = false)
    private Integer id;

    @Size(max = 50)
    @NotNull
    @Column(name = "_pay_code", nullable = false, length = 50)
    private String payCode;

    @Size(max = 50)
    @Nationalized
    @Column(name = "_pay_name", length = 50)
    private String payName;

}