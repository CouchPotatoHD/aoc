package com.ismaylov.day3;

import java.util.List;

public class Solving {

    public long maximumJoltage(List<Bank> banks) {

        long sumJoltage = 0;
        for (Bank bank : banks) {
            int maxPair = findMaxPair(bank);
            sumJoltage += maxPair;
        }

        return sumJoltage;

    }

    public long maximumJoltageWith12Digits(List<Bank> banks) {

        long sumJoltage = 0;
        for (Bank bank : banks) {
            long maxPair = findMaxPair12Digits(bank);
            sumJoltage += maxPair;
        }

        return sumJoltage;

    }

    private int findMaxPair(Bank bank){

        int max = 0;

        for (int i = 0; i < bank.getBattery().size(); i++) {
            for (int j = i + 1; j < bank.getBattery().size(); j++) {
                int curr = Integer.parseInt(String.valueOf(bank.getBattery().get(i)) + bank.getBattery().get(j));
                if (curr > max) {
                    max = curr;
                }
            }
        }

        return max;

    }

    private long findMaxPair12Digits(Bank bank){

        StringBuilder result = new StringBuilder();
        int currentIndex = 0;
        int digitsCount = 12;

        for (int i = 0; i < digitsCount; i++) {

            int maxAllowedIndex = bank.getBattery().size() - (digitsCount - i);

            int maxDigitIndex = findMaxDigitIndex(bank.getBattery(), currentIndex, maxAllowedIndex);

            result.append(bank.getBattery().get(maxDigitIndex));
            currentIndex = maxDigitIndex + 1;

        }

        return Long.parseLong(result.toString());

    }

    private int findMaxDigitIndex(List<Integer> arr, int start, int end){

        int maxDigit = arr.get(start);
        int maxIndex = start;

        for (int i = start + 1; i <= end; i++) {
            if (arr.get(i) > maxDigit) {
                maxDigit = arr.get(i);
                maxIndex = i;
            }
        }

        return maxIndex;

    }

}
