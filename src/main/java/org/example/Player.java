package org.example;

import java.util.ArrayList;

public class Player {

    protected String name;
    protected ArrayList<Card> hand;

    public Player(String name, ArrayList<Card> hand) {
        this.name = name;
        this.hand = hand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Player{");
        sb.append("name='").append(name).append('\'');
        sb.append(", hand=").append(hand);
        sb.append('}');
        return sb.toString();
    }
}
