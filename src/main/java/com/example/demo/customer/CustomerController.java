package com.example.demo.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @GetMapping// Http method to associate this method;
    Customer getCustomer() {
        return new Customer(1L, "James Bond");
    }
}
