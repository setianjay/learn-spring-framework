package com.setianjay.spring.core.game;

public class GameRunner {
    private final GameConsole game;

    public GameRunner(GameConsole game){
        this.game = game;
    }

    public void runGame(){
        System.out.println("Run game: " + this.game);
        this.game.up();
        this.game.down();
        this.game.left();
        this.game.right();
    }
}
