package com.poorna.store_billing.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;


@Entity
public class Customer {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String customerId = UUID.randomUUID().toString().replace("-", "");

    private String name;

    @Min(value = 0, message = "Age is invalid")
    @Max(value = 110, message = "Age is invalid")
    private Long age;

    private String mobileNumber;
    private String Address;

    public Customer(){}
}
