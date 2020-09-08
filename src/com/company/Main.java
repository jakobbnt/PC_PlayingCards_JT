package com.company;

import java.util.EmptyStackException;

public class Main {

    public static void main(String[] args) throws EmptyStackException {
        Game game = new Game();
        System.out.println(game.startGame());
    }
}
