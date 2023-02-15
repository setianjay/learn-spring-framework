package com.setianjay.spring.core.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * This class is IoC Container and know as ApplicationContext
 */
@Configuration
public class HelloWordConfiguration {

    @Bean
    public String sayHello() {
        return "Hello World";
    }

    @Bean
    public String name() {
        return "Hari Setiaji";
    }

    @Bean
    int age() {
        return 22;
    }

    //Create Bean with custom name
    @Bean(name = "brotherName")
    public String name2() {
        return "Gurindo Sekti";
    }

    //Create Bean with custom name
    @Bean(name = "brotherAge")
    public int age2() {
        return 25;
    }

    @Primary
    @Bean
    Person detailPerson() {
        return new Person("Hari Setiaji", 22);
    }

    @Bean
    Person detailPersonWithCallBeanMethod() {
        return new Person(name(), age());
    }

    @Bean
    Person detailPersonWithParameterBeanMethod(String brotherName, int brotherAge){
        return new Person(brotherName, brotherAge);
    }

}
