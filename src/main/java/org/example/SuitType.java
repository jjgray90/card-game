package org.example;

public enum SuitType {
    SPADE("\u2660", false), HEART("\u2665", true), DIAMOND("\u2666", true), CLUB("\u2663", false);

    private final String unicode;

    SuitType(String unicode, boolean isRed) {
        if (isRed) {
            this.unicode = "\u001b[31m" + unicode + "\u001b[0m";
        } else this.unicode = unicode;
    }

    public String toString() {
        return this.unicode;
    }


    public static void main(String[] args) {
        System.out.println(SPADE);
        System.out.println(HEART);
        System.out.println(DIAMOND);
        System.out.println(CLUB);

    }
}

