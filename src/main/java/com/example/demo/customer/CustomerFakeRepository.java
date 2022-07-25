package com.example.demo.customer;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

//@Repository(value = "fake") // Bean of CustomerRepo interface
// => is removed because we are instantiating CustomerFakeRepository class in configuration file
public class CustomerFakeRepository implements CustomerRepo {
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L, "James Bond", "password123"),
                new Customer(2L, "Jamila Ahmed", "123password")
        );
    }
}
