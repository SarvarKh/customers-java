package com.example.demo.customer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component // Bean of CustomerRepo interface
@Primary
public class CustomerRepository implements CustomerRepo {
    @Override
    public List<Customer> getCustomers() {
//        TODO Connect to real DB
        return Collections.emptyList();
    }
}
