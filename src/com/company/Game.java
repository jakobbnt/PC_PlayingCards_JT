package com.company;

import java.util.EmptyStackException;

public class Game {

    Player player1;
    Player player2;
    Deck deck;

    public Game() {
        this.deck = new Deck();
        this.player2 = new Player("Ditte", 0);
        this.player1 = new Player("Søren", 0);
    }

    public String startGame() throws EmptyStackException {
        this.deck.shuffle();
        while(player1.getWins() != 3 || player2.getWins() != 3){
            if(deck.getCards().pop().compareTo(deck.getCards().pop()) > 0){
                player1.setWins(player1.getWins() + 1);
            }else{
                player2.setWins(player2.getWins() + 1);
            }
            System.out.println(player1.getName() + "'s score: " + player1.getWins() + " " + player2.getName() + "'s score: " + player2.getWins());
            if(player1.getWins() == 3){
                 return player1.name + " WINS!";
            }else if (player2.getWins() == 3){
                return player2.name + " WINS!";
            }
        }
        return "Something went wrong :(";
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }
}
