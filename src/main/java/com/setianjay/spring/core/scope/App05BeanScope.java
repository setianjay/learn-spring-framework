package com.setianjay.spring.core.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class Singleton{

}

class Prototype{

}

public class App05BeanScope {

    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(BeanScopeService.class)){

            System.out.println(context.getBean(Singleton.class));
            System.out.println(context.getBean(Singleton.class));
            System.out.println(context.getBean(Singleton.class));
            System.out.println(context.getBean(Singleton.class));
            System.out.println(context.getBean(Singleton.class));

            System.out.println("--------------------------------------------------");

            System.out.println(context.getBean(Prototype.class));
            System.out.println(context.getBean(Prototype.class));
            System.out.println(context.getBean(Prototype.class));
            System.out.println(context.getBean(Prototype.class));
            System.out.println(context.getBean(Prototype.class));
        }
    }
}
