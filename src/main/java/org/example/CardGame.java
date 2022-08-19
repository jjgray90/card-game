package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

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

    public static Card dealCard(ArrayList<Card> cardDeck) {
        Card dealtCard = cardDeck.get(0);
        cardDeck.remove(0);
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

    static ArrayList<Player> playerList = new ArrayList<>();


    public String getInput(String message) {
        Scanner scan = new Scanner(System.in);
        if (message != null) {
            System.out.println(message);
        }
        return scan.nextLine();
    }

    public void dealCards(ArrayList<Player> playerList) {
        createDeck();
        shuffleDeck();
        int deckLength = deckOfCards.size();

        for (int i = 0; i < (deckLength / playerList.size()); i++) {
            for (Player player : playerList) {
                player.getHand().add(dealCard(deckOfCards));
            }
        }
    }

    public void addPlayers() {
        while (true) {
            String input = getInput("Add player");
            if (input.equals("") && playerList.size() > 0) {
                break;
            } else if (input.equals("")) {
                System.err.println("Please enter at least one player");
                continue;
            }
            playerList.add(new Player(input));
        }
    }
}
