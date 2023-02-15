package com.setianjay.spring.core.game;

public class App01GamingBasic {

    public static void main(String[] args) {
        GameConsole marioGame = new MarioGame();
        GameConsole superContraGame = new SuperContraGame();
        PacmanGame pacmanGame = new PacmanGame();

        GameRunner gameRunner = new GameRunner(pacmanGame);
        gameRunner.runGame();
    }
}
