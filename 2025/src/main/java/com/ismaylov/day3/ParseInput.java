package com.ismaylov.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParseInput {

    public static void main(String[] args) {
        Solving solving = new Solving();

        List<Bank> banks = new ArrayList<>();

        try (BufferedReader reader = Files.newBufferedReader(Path.of("2025/src/main/resources/day3Source.txt"))) {

            reader
                    .lines()
                    .forEach(s -> {
                        Bank bank = new Bank(
                                Arrays.stream(s.split("")).map(Integer::parseInt).toList()
                        );
                        banks.add(bank);
                    });

            //System.out.println("Max joltage is: " + solving.maximumJoltage(banks));
            System.out.println("Max joltage with 12 digits is: " + solving.maximumJoltageWith12Digits(banks));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
