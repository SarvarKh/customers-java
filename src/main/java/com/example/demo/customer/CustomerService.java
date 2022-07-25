package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService { //now this is bean that we can inject in multiple places
    private final CustomerRepo customerRepo;

    @Autowired
    public CustomerService(
//            @Qualifier("fake")
            CustomerRepo customerRepo
    ) {
        this.customerRepo = customerRepo;
    }

    List<Customer> getCustomer() {
        return customerRepo.getCustomers();
    }
}
