package com.poorna.store_billing.model;

import jakarta.persistence.*;
import jdk.jfr.Timestamp;

import java.time.LocalDateTime;

@Entity
public class Order {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Customer customer;

    @Timestamp
    private LocalDateTime timeOfOrder;

    private Long productId;

    private String productName;

}
