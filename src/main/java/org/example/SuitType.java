package org.example;

public enum SuitType {
    SPADE("\u2660", false), HEART("\u2665", true), DIAMOND("\u2666", true), CLUB("\u2663", false);

    private final String unicode;
    private final boolean red;

    SuitType(String unicode, boolean red) {
        this.unicode = unicode;
        this.red = red;
    }

    public boolean isRed() {
        return red;
    }

    public String toString() {
        return this.unicode;
    }
}

