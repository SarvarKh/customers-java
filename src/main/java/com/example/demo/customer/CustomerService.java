package com.example.demo.customer;

import org.springframework.stereotype.Component;

@Component
public class CustomerService { //now this is bean that we can inject in multiple places
    Customer getCustomer() {
        return new Customer(1L, "James Bond");
    }
}
