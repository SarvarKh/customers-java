package com.example.demo.customer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

//@Repository // Bean of CustomerRepo interface
// => is removed because we are instantiating CustomerRepository class in configuration file.
//@Primary is removed because CustomerRepo bean was added & it is being done via configuration now.
public class CustomerRepository implements CustomerRepo {
    @Override
    public List<Customer> getCustomers() {
//        TODO Connect to real DB
        return Collections.singletonList(
                new Customer(1L, "TODO. Implement real DB ")
        );
    }
}
