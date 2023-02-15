package com.setianjay.spring.core.game;

public class PacmanGame implements GameConsole {
    @Override
    public void up() {
        System.out.println("Jump");
    }

    @Override
    public void down() {
        System.out.println("Bounce");
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
