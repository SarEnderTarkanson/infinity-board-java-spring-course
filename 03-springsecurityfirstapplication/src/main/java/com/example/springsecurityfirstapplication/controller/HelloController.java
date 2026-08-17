package com.example.springsecurityfirstapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/public")
    public String publicApi() {
        return "Public API - No Authentication required";
    }
    @GetMapping("/secure")
    public String secureApi() {
        return "Secure API - Authentication is required";
    }

}
