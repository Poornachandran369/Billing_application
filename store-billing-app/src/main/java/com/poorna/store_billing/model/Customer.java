package com.poorna.store_billing.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;


@Entity
public class Customer {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long customerId;

    private String name;

    @Min(value = 0, message = "Age is invalid")
    @Max(value = 110, message = "Age is invalid")
    private Long age;

    @Email
    private String email;

    private String mobileNumber;
    private String Address;

}
