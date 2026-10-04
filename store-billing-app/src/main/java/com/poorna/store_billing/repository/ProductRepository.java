package com.poorna.store_billing.repository;

import com.poorna.store_billing.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
