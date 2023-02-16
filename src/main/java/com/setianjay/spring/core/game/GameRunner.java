package com.setianjay.spring.core.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private final GameConsole game;

    @Autowired
    public GameRunner(@Qualifier(value = "SuperContraQualifier") GameConsole game){
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
