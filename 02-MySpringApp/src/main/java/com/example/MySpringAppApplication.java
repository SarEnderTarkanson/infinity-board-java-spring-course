package com.example;

import com.example.core.PaymentService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringAppApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        PaymentService paymentService = context.getBean("paymentService", PaymentService.class);

        paymentService.processPayment();

        context.close();
    }

}
