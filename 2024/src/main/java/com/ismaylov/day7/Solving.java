package com.ismaylov.day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solving {

    public boolean isRightEquation(long testValue, long[] values, char[] operators) {

        char[] template = new char[values.length-1];
        Arrays.fill(template, operators[0]);

        List<Combination> combinations = fillTheCombinations(operators, new ArrayList<>(), 0, template);

        for (int i = 0; i < combinations.size(); i++) {

            long result = 0;

            Combination combination = combinations.get(i);

            for (int j = 0; j < combination.operators.length; j++) {
                if (j == 0) {
                    result = Operations.getFunctionByOperand(combination.operators[j]).apply(values[j], values[j + 1]);
                } else {
                    result = Operations.getFunctionByOperand(combination.operators[j]).apply(result, values[j + 1]);
                }
            }

            if (result == testValue) {
                return true;
            }

        }

        return false;

    }

    public static List<Combination> fillTheCombinations(
            char[] operators,
            List<Combination> combinations,
            int index,
            char[] template) {

        if (index == template.length) {
            combinations.add(new Combination(template.clone()));
            return combinations;
        }

        for (char operator : operators) {
            template[index] = operator;
            fillTheCombinations(operators, combinations, index + 1, template);
        }
        return combinations;
    }

}