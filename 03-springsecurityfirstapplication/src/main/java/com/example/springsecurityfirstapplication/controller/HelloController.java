package com.example.springsecurityfirstapplication.controller;

import com.example.springsecurityfirstapplication.security.JwtUtil;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/auth")
    public String login(@RequestParam String username, @RequestParam String password) {
        if (("admin".equals(username) && "admin123".equals(password)) ||
                ("user".equals(username) && "user123".equals(password))) {
            return JwtUtil.generateToken(username);
        }
        throw new RuntimeException("Invalid credentials");
    }
}
