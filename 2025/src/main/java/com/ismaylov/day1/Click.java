package com.ismaylov.day1;

import java.util.function.BiFunction;

public enum Click {

    LEFT((x, y) -> (((y - x) % 100) + 100) % 100),
    RIGHT((x, y) -> (y + x) % 100);

    public final BiFunction<Integer, Integer, Integer> clickCalculation;

    Click(BiFunction<Integer, Integer, Integer> function) {
        this.clickCalculation = function;
    }
}