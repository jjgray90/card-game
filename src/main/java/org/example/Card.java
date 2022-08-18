package org.example;

public class Card {

    protected String suit;
    protected String symbol;
    protected int value;
    protected boolean red;

    public Card(SuitType suit, SymbolType symbol) {
        this.suit = String.valueOf(suit);
        this.symbol = String.valueOf(symbol);
        this.value = Integer.parseInt(String.valueOf(symbol.ordinal() + 2));
//        this.red = getSuit.isRed();
    }

    public int getValue() {
        return value;
    }

    public String getSuit() {
        return suit;
    }

    public String toString() {

        String colour = null;

        if (this.suit.equals("♦") || this.suit.equals("♥")) {
            colour = "\u001b[31m";
        } else {
            colour = "\u001b[30;1m";
        }

//        return "[suit=" + this.suit + ", symbol=" + this.symbol + ", value=" + this.value + "]";
        return
                "\u001b[47m  " + colour + this.symbol + "            \u001b[0m\n"

                        + "\u001b[47m  " + colour + this.suit + "             \u001b[0m\n"
                        + "\u001b[47m                \u001b[0m\n"
                        + "\u001b[47m       " + colour + this.suit + "        \u001b[0m\n"
                        + "\u001b[47m                \u001b[0m\n"
                        + "\u001b[47m             " + colour + this.suit + "  \u001b[0m\n"
                        + "\u001b[47m             " + colour + this.symbol + " \u001b[0m\n"
                ;


    }

    public static void main(String[] args) {
        Card card = new Card(SuitType.DIAMOND, SymbolType.EIGHT);

        System.out.println(card);
    }

}
