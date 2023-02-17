package com.setianjay.spring.core.scope;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanScopeService {

    @Bean
    Singleton provideSingletonClass(){
        System.out.println("initialization singleton running");
        return new Singleton();
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    Prototype providePrototypeClass(){
        System.out.println("initialization prototype running");
        return new Prototype();
    }

    @PostConstruct
    void afterInitializationCompleted(){
        System.out.println("You can add some logic in @PostConstruct after initialization process completed");
        System.out.println("Initialization process completed");
    }

    @PreDestroy
    void beforeApplicationContextClosing(){
        System.out.println("You can add some login in @PreDestroy after application context closing");
        System.out.println("Application context destroying, all bean has destroy");
    }
}
