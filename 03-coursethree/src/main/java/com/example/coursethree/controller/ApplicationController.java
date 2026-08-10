package com.example.coursethree.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    @Value("${app.name:DefaultAppName}")
    private String appName;

    @Value("${app.version}")
    private String appVersion;

    @GetMapping("/app")
    public String app() {
        return "Welcome to the " + appName + " ma" +  "and the app version is: " + appVersion;
    }

}
