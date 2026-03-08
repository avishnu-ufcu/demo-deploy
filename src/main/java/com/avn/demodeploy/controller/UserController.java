package com.avn.demodeploy.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.avn.demodeploy.entity.Customer;
import com.avn.demodeploy.repository.CustomerRepository;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class UserController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/user")
    public User getUser() {
        return new User(1L, "John Doe", "john.doe@example.com", "john_doe");
    }

    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        log.info("Fetching all customers from database");
        return customerRepository.findAll();
    }

}

