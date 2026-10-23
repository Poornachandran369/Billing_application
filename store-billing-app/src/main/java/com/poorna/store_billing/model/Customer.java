package com.poorna.store_billing.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.UniqueElements;

import java.util.UUID;


@Entity
public class Customer {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String customerId = UUID.randomUUID().toString().replace("-", "");

    @NotBlank
    @Column(nullable = false)
    private String name;

    @Min(value = 0, message = "Age is invalid")
    @Max(value = 110, message = "Age is invalid")
    private Long age;

    @Column(nullable = false)
    private String mobileNumber;

    private String email;

    @OneToOne
    @JoinTable(name = "customerId")
    private Account account;

    public Customer(){}
}
