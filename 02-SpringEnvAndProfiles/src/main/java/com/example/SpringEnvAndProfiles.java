package com.example;

import com.example.config.AppConfig;
import com.example.service.DatabaseService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringEnvAndProfiles {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.getEnvironment().setActiveProfiles("dev");

        context.register(AppConfig.class);
        context.refresh();

        DatabaseService databaseService = context.getBean(DatabaseService.class);
        databaseService.connect();

        context.close();
    }

}
