package com.example.SpringSpecializationThirdCourse.controller;

import com.example.SpringSpecializationThirdCourse.config.AppConfig;
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
        return "Welcome to " + appName + " and the version is " + appVersion;
    }

    @GetMapping("/config")
    public String config() {
        return "Welcome to App Config" +  appConfig.getName() + ", Version: " + appConfig.getVersion() + ", Author: " + appConfig.getAuthor();
    }

}
