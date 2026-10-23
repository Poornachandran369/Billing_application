package com.poorna.store_billing.controller;

import com.poorna.store_billing.model.Customer;
import com.poorna.store_billing.service.CustomerService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

  private final CustomerService customerService;

  public CustomerController(CustomerService customerService) {
      this.customerService = customerService;
  }

  public Customer AddCustomer(Customer customer) {
      return customerService.addCustomer(customer);
  }

}
