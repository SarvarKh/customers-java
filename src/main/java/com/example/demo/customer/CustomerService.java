package com.example.demo.customer;

import com.example.demo.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService { //now this is bean that we can inject in multiple places
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(
//            @Qualifier("fake")
            CustomerRepository customerRepository
    ) {
        this.customerRepository = customerRepository;
    }

    List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    Customer getCustomer(Long id) {
        return customerRepository
                .findById(id)
                .orElseThrow(() -> new NotFoundException(
                        "customer with id " + id + " not found"));
    }
}
