package org.example;

import java.util.ArrayList;
import java.util.Collections;

public abstract class CardGame {

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

    public static Card dealCard() {
        Card dealtCard = deckOfCards.get(0);
        deckOfCards.remove(0);
        System.out.println(dealtCard);
        return dealtCard;
    }

    public static void sortDeckInNumberOrder() {
        deckOfCards.sort((a, b) -> a.getValue() - b.getValue());
    }

    public static void sortDeckIntoSuits() {
        deckOfCards.sort((a, b) -> a.getSuit().compareTo(b.getSuit()));
    }

    public static void shuffleDeck() {
        Collections.shuffle(deckOfCards);
    }

    public static void main(String[] args) {
        createDeck();
        sortDeckInNumberOrder();
        getDeck();
        sortDeckIntoSuits();
        getDeck();
        System.out.println(dealCard());
    }
}
