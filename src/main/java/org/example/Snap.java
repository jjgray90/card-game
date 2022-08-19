package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Snap extends CardGame {

    public static void getInput(String message) {
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        scan.nextLine();
    }

    public static void dealCards(ArrayList<Player> playerList) {
        createDeck();
        shuffleDeck();
        int deckLength = deckOfCards.size();

        for (int i = 0; i < (deckLength / playerList.size()); i++) {
            for (Player player : playerList) {
                player.getHand().add(dealCard(deckOfCards));
            }
        }
    }

    public static boolean checkWin(Card currentCard, Card previousCard) {
        return previousCard != null && (currentCard.getValue() == previousCard.getValue());
    }


    public void playGame() {
        Card previousCard = null;
        ArrayList<Player> playerList = new ArrayList<>();
        playerList.add(new Player("JJ", new ArrayList<>()));
        playerList.add(new Player("Charlie", new ArrayList<>()));
        playerList.add(new Player("Trevor", new ArrayList<>()));
        dealCards(playerList);

        int playerIndex = 0;
        Player currentPlayer = playerList.get(playerIndex);


        gameLoop:
        while (true) {

            getInput(currentPlayer.getName() + "'s turn");
            Card currentCard = (dealCard(currentPlayer.getHand()));
            System.out.println(currentCard);

            if (checkWin(currentCard, previousCard)) {
                System.out.println("SNAP! " + currentPlayer.getName() + " wins");
                break gameLoop;
            }
            previousCard = currentCard;

            if (playerList.get(playerList.size() - 1).getHand().size() == 0) {
                System.out.println("Reshuffling deck");
                dealCards(playerList);
            }
            playerIndex++;
            currentPlayer = playerList.get(playerIndex % playerList.size());

        }
    }
}



