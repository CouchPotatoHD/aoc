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

}
