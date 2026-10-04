package com.poorna.store_billing.repository;

import com.poorna.store_billing.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
