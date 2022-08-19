package org.example;

public class Card {

    protected SuitType suit;
    protected SymbolType symbol;
    protected int value;
    protected boolean red;

    public Card(SuitType suit, SymbolType symbol) {
        this.suit = suit;
        this.symbol = symbol;
        this.value = Integer.parseInt(String.valueOf(symbol.ordinal() + 2));
        this.red = getSuit().isRed();
    }

    public int getValue() {
        return value;
    }


    public SuitType getSuit() {
        return suit;
    }

    public String toString() {

        String colour;

        if (this.suit.isRed()) {
            colour = "\u001b[31;1m";
        } else {
            colour = "\u001b[30;1m";
        }

        return
                "\u001b[47m                \u001b[0m\n"
                        + "\u001b[47m  " + colour + this.symbol + "            \u001b[0m\n"

                        + "\u001b[47m  " + colour + this.suit + "             \u001b[0m\n"
                        + "\u001b[47m                \u001b[0m\n"
                        + "\u001b[47m                \u001b[0m\n"
                        + "\u001b[47m       " + colour + this.suit + "        \u001b[0m\n"
                        + "\u001b[47m                \u001b[0m\n"
                        + "\u001b[47m                \u001b[0m\n"
                        + "\u001b[47m             " + colour + this.suit + "  \u001b[0m\n"
                        + "\u001b[47m             " + colour + this.symbol + " \u001b[0m\n"
                        + "\u001b[47m                \u001b[0m\n"

                ;
    }

    public static void main(String[] args) {
        Card card = new Card(SuitType.DIAMOND, SymbolType.EIGHT);

        System.out.println(card);
    }

}
