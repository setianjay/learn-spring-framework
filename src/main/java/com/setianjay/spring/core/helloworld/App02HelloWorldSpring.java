package com.setianjay.spring.core.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

    public static void main(String[] args) {
        /*
        1: Launch a Spring Context -
        because we use annotation for configuration not xml, to initialize Spring Context or Application Context
        we use class @AnnotationConfigAppApplication and pass the configuration class as argument.

        note:
        - @HelloWorldConfiguration class handle the things that we want Spring to manage.
        - Concept of IoC in Spring like dependency injection in android if we use Dagger or Hilt.
        */
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(HelloWordConfiguration.class);

        /*
        2: Retrieving Beans or Object that managed the process of initialization by Spring use with the
        @ApplicationContext that we have initialize above and call function getBean().

        note:
        - If in Configuration File is not duplicate Bean, we can use getBean() with the ClassName as argument.
        - If in Configuration File have duplicate Bean, we can use getBean() with the name of Bean as argument, or
        we can use @Primary annotation, and we can use @Qualifier annotation.
        */
        //Get bean (object) with name of bean
        Object saySomething1 = applicationContext.getBean("sayHello");
        System.out.println(saySomething1);
        System.out.println(applicationContext.getBean("brotherName"));
        System.out.println(applicationContext.getBean("brotherAge"));
        System.out.println(applicationContext.getBean("detailPersonWithCallBeanMethod"));
        System.out.println(applicationContext.getBean("detailPersonWithParameterBeanMethod"));

        //Get bean (object) with class
        System.out.println(applicationContext.getBean(Person.class));
    }
}
