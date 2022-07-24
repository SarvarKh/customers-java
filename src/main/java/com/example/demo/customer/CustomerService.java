package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerService { //now this is bean that we can inject in multiple places
    private final CustomerRepo customerRepo;

    public CustomerService(@Qualifier("fake") CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    List<Customer> getCustomer() {
        return customerRepo.getCustomers();
    }
}
