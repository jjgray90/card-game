package org.example;

public class Card {

    protected String suit;
    protected String symbol;
    protected int value;

    public Card(SuitType suit, SymbolType symbol) {
        this.suit = String.valueOf(suit);
        this.symbol = String.valueOf(symbol);
        this.value = Integer.parseInt(String.valueOf(symbol.ordinal() + 2));
    }


    public String toString() {
        return getClass().getSimpleName() + "[suit=" + this.suit + ", symbol=" + this.symbol + ", value=" + this.value + "]";
    }

    public static void main(String[] args) {

    }

}
