package com.company;

import java.util.Objects;

public class Card implements Comparable<Card>{
    Colors color;
    Value value;

    public Card(){

    }

    public Card(Colors color, Value value) {
        this.color = color;
        this.value = value;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return color == card.color &&
                value == card.value;
    }

    @Override
    public int compareTo(Card o) {
        if(this.value != o.getValue()){
            if(this.value.compareTo(o.getValue()) > 0){
                return 1;
            }else {
                return -1;
            }
        }else {
            if(this.color.compareTo(o.getColor()) > 0){
                return 1;
            }else{
                return -1;
            }
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, value);
    }

    @Override
    public String toString() {
        return "Card{" +
                "color=" + color +
                ", value=" + value +
                '}';
    }
}
