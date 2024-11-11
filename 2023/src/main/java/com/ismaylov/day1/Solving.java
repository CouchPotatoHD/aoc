package com.ismaylov.day1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solving {

    private static final Map<String, Integer> stringNumbersMap = new HashMap<>() {{
        put("one", 1);
        put("two", 2);
        put("three", 3);
        put("four", 4);
        put("five", 5);
        put("six", 6);
        put("seven", 7);
        put("eight", 8);
        put("nine", 9);
        put("zero", 0);
        put("1", 1);
        put("2", 2);
        put("3", 3);
        put("4", 4);
        put("5", 5);
        put("6", 6);
        put("7", 7);
        put("8", 8);
        put("9", 9);
        put("0", 0);
    }};

    /**
     * check if first and last chars are digits
     * for the rest - use two pointer to simultaneously find first and last digit
     * or use string index of to find each number in string and its starting index, the lowest is the first and the highest is the last
     */
    public String getFirstAndLastDigitFromString(String str) {

        Map<String, List<Integer>> resultsMap = new HashMap<>(2);

        String firstDigit = null;
        String lastDigit = null;

        char[] chars = str.toCharArray();

        if ((int) chars[0] >= 48 && (int) chars[0] <= 57) {
            firstDigit = String.valueOf(chars[0]);
        }
        if ((int) chars[chars.length - 1] >= 48 && (int) chars[chars.length - 1] <= 57) {
            lastDigit = String.valueOf(chars[chars.length - 1]);
        }

        if (firstDigit != null && lastDigit != null) {
            return firstDigit + lastDigit;
        }

        for (String key : stringNumbersMap.keySet()) {

            int lowestIndex = str.indexOf(key);
            int highestIndex = str.lastIndexOf(key);

            if ((resultsMap.get("first") == null || lowestIndex < resultsMap.get("first").getFirst()) && str.contains(key)) {
                resultsMap.put("first", List.of(lowestIndex, stringNumbersMap.get(key)));
            }
            if ((resultsMap.get("last") == null || highestIndex > resultsMap.get("last").getFirst()) && str.contains(key)) {
                resultsMap.put("last", List.of(highestIndex, stringNumbersMap.get(key)));
            }
        }
        return String.valueOf(resultsMap.get("first").getLast()) + resultsMap.get("last").getLast();
    }
}