package com.ismaylov.day7;

import java.util.function.BiFunction;

public enum Operations {

    ADD('+', Long::sum),
    MULTIPLY('*', (v1, v2) -> v1 * v2),
    CONCAT('|', (v1, v2) -> Long.parseLong(v1 + "" + v2));

    public final char operand;
    public final BiFunction<Long, Long, Long> operation;

    Operations(char operand, BiFunction<Long, Long, Long> operation) {
        this.operand = operand;
        this.operation = operation;
    }

    public static BiFunction<Long, Long, Long> getFunctionByOperand(char operand) {
        for (Operations value : values()) {
            if (value.operand == operand) return value.operation;
        }
        return null;
    }
}
