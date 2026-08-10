package com.example.coursethree.controller;

import com.example.coursethree.config.AppConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    private final AppConfig appConfig;

    public ApplicationController(AppConfig appConfig) {
        this.appConfig = appConfig;
    }

    @Value("${app.name:DefaultAppName}")
    private String appName;

    @Value("${app.version}")
    private String appVersion;

    @GetMapping("/app")
    public String app() {
        return "Welcome to the " + appName + " ma" +  "and the app version is: " + appVersion;
    }

    @GetMapping("/config")
    public String config() {
        return "Application name: " + appConfig.getName() + " Application version: " + appConfig.getVersion() + " Application's author: "  + appConfig.getAuthor();
    }

}
