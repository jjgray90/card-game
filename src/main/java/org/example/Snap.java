package org.example;

import java.util.Scanner;

public class Snap extends CardGame {

    public static void getInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Your turn");
        scan.nextLine();
    }

    public  void playGame() {
        Card previousCard = null;
        createDeck();
        shuffleDeck();

        while (true) {
            getInput();
            Card currentCard = dealCard();

            if (previousCard != null && (currentCard.getValue() == previousCard.getValue())) {
                System.out.println("SNAP!");
                break;
            }
            previousCard = currentCard;
        }
    }



}



