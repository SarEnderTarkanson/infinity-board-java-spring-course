package com.example.springsecurityfirstapplication.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/admin/dashboard")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminDashboard() {
        return "Admin Dashboard - Admin role is required";
    }

    @GetMapping("/user/profile")
    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    public String userProfile() {
        return "User Profile - User role is required";
    }

    @GetMapping("/user/{id}")
    @PreAuthorize("#id == authentication.principal.username")
    public String getUser(@PathVariable String id) {
        return "User Profile for " + id;
    }

}
