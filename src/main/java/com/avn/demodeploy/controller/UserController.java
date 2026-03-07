package com.avn.demodeploy.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class UserController {

    @GetMapping("/user")
    public User getUser() {
        return new User(1L, "John Doe", "john.doe@example.com", "john_doe");
    }

}

