package com.company;
import java.util.Collections;
import java.util.Stack;

public class Deck {

    Stack<Card> cards = new Stack<Card>();

    public Deck(){
        for (Colors c: Colors.values()) {
            for(Value v: Value.values()){
                cards.push(new Card(c,v));
            }
        }
    }

    public Stack<Card> getCards() {
        return cards;
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

}
