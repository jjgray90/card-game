package org.example;

import java.util.Date;

public class Snap extends CardGame {

    public boolean checkWin(Card currCard, Card prevCard) {

        if (prevCard != null && (currCard.getValue() == prevCard.getValue())) {
            long startTime = System.currentTimeMillis();
            long elapsedTime = (new Date()).getTime() - startTime;
            String input = getInput(null);

            if (input.equalsIgnoreCase("snap") && elapsedTime < 3_000) {
                System.out.println("SNAP!");
                return true;
            } else System.out.println("Too slow");
        }
        return false;
    }

    public void playGame() {
        System.out.println("Welcome to snap! Enter player names. When all players have been entered, press enter to start game.");

        Card previousCard = null;
        addPlayers();
        dealCards(playerList);

        int playerIndex = 0;
        Player currentPlayer = playerList.get(playerIndex);


        while (true) {

            getInput(currentPlayer.getName() + "'s turn");
            Card currentCard = (dealCard(currentPlayer.getHand()));
            System.out.println(currentCard);

            if (checkWin(currentCard, previousCard)) {
                break;
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



