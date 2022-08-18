package org.example;

import java.util.ArrayList;

public class CardGame {

    static ArrayList<Card> deckOfCards = new ArrayList<>();

    public static void createDeck() {
        for (int i = 0; i < SuitType.values().length; i++) {
            for (int j = 0; j < SymbolType.values().length; j++) {
                deckOfCards.add(new Card(SuitType.values()[i], SymbolType.values()[j]));
            }
        }
    }

    public static void getDeck() {
        for (Card card : deckOfCards) {
            System.out.println(card);
        }

    }

    public static void main(String[] args) {
        createDeck();
        getDeck();
    }

}
