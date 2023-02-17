package com.setianjay.spring.core.lazy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
class ClassA {

}

@Component
@Lazy
class ClassB {
    private final ClassA classA;

    public ClassB(ClassA classA){
        System.out.println("Running injection process");
        this.classA = classA;
    }

    public void doSomething(){
        System.out.println("Do something in class B");
    }
}
@Configuration
@ComponentScan
public class App04LazyInitialization {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(App04LazyInitialization.class)){
            System.out.println("Process initialization in startup is completed");

            context.getBean(ClassB.class).doSomething();
        }

    }
}
