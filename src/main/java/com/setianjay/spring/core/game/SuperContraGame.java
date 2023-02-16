package com.setianjay.spring.core.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier(value = "SuperContraQualifier")
public class SuperContraGame implements GameConsole {
    @Override
    public void up() {
        System.out.println("Jump");
    }

    @Override
    public void down() {
        System.out.println("Get down");
    }

    @Override
    public void left() {
        System.out.println("Move to left");
    }

    @Override
    public void right() {
        System.out.println("Move to right");
    }
}
