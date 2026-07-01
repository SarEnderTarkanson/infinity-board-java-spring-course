package com.example;

import com.example.config.AppConfig;
import com.example.service.DatabaseService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MySpringAppApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        DatabaseService databaseService = context.getBean(DatabaseService.class);

        databaseService.connect();

        context.close();
    }

}
