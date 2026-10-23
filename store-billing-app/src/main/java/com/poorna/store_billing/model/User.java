package com.poorna.store_billing.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
public class User {

    @Id
    Long Id;

    @Min(value = 3, message = "User name is too short." )
    @Max(value = 50, message = "User name is too long")

    @NotBlank
    @Column(unique = true, nullable = false)
    String name;

    private String mobileNumber;

    private String email;

    @OneToOne
    @JoinTable(name = "userId")
    private Account account;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(){}
}
