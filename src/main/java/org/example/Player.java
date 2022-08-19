package org.example;

import java.util.ArrayList;

public class Player {

    protected String name;
    protected ArrayList<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    @Override
    public String toString() {
        return "Player{" + "name='" + name + '\'' + ", hand=" + hand + '}';
    }
}
