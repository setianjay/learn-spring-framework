package com.setianjay.spring.core.exercise.database;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class App03RealWorldSpringContextApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(App03RealWorldSpringContextApplication.class);

        //inject BusinessCalculationService class
        BusinessCalculationService businessCalculationService = context.getBean(BusinessCalculationService.class);
        System.out.println("Get max value: " + businessCalculationService.findMax());
    }
}
