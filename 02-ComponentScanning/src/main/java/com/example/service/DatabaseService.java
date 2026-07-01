package com.example.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatabaseService {

    @Value("${db.url}")
    private String dbUrl;

    @Value("${db.username}")
    private String dbUsername;

    @Value("${db.password}")
    private String dbPassword;

    public void connect() {
        System.out.println("Connecting to database...");
        System.out.println("Database URL: " + dbUrl);
        System.out.println("Database username: " + dbUsername);
    }
}
