package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Create RESTfull end point
@SpringBootApplication // Kick-offs the app
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@GetMapping // Http method to associate this method;
	Customer getCustomer() {
		return new Customer(1L, "James Bond");
	}

	// This is simple RESTfull API
	class Customer {
		private final Long id;
		private final String name;

		public Customer(Long id, String name) {
			this.id = id;
			this.name = name;
		}

		public Long getId() {
			return id;
		}

		public String getName() {
			return name;
		}

	}
}
