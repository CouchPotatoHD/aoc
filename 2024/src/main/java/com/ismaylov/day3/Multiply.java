package com.ismaylov.day3;

public class Multiply {

    int x;
    int y;

    public Multiply(String s) {
        String[] splitted = s.split(",");
        this.x = Integer.parseInt(splitted[0]);
        this.y = Integer.parseInt(splitted[1]);
    }

    public int doMultiply() {
        return this.x * this.y;
    }
}
