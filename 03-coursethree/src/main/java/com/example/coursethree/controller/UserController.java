package com.example.coursethree.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {

    @GetMapping("/")
    public String welcome() {
        return "Welcome to the user API!";
    }

    @GetMapping("/users")
    public String users() {
        return "List of users!";
    }

}
