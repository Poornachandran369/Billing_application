package com.poorna.store_billing.model;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;
import java.math.BigDecimal;
import java.util.List;

@Entity
public class OrderItem {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long Id;

    @OneToMany
    private List<Product> product;

    public Long getOrderItemId() {
        return Id;
    }

    public void setOrderItemId(Long orderItemId) {
        this.Id = orderItemId;
    }

    public OrderItem (){}
}
