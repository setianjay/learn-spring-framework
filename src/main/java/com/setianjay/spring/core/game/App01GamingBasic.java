package com.setianjay.spring.core.game;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class App01GamingBasic {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(App01GamingBasic.class);

        //testing initializing PacmanClass with automation providing by Spring
        context.getBean(GameConsole.class).up();

        context.getBean(GameRunner.class).runGame();
    }
}
