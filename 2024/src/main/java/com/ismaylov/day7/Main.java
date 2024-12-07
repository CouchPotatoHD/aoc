package com.ismaylov.day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Solving solving = new Solving();

        try (BufferedReader reader = Files.newBufferedReader(Path.of("2024/src/main/resources/day7Source.txt"))) {

            List<String> list = reader.lines().toList();

            long result = 0;
            long result2 = 0;

            for (String s : list) {

                String[] testValue = s.split(":");
                String[] values = testValue[1].split(" ");
                result += solving.isRightEquation(Long.parseLong(testValue[0]), parseLongValues(values), new char[]{'+', '*'}) ? Long.parseLong(testValue[0]) : 0;
                result2 += solving.isRightEquation(Long.parseLong(testValue[0]), parseLongValues(values), new char[]{'+', '*', '|'}) ? Long.parseLong(testValue[0]) : 0;
            }

            //first part
            System.out.println(result);

            //second part
            System.out.println(result2);

        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
    }

    static long[] parseLongValues(String[] strings) {

        long[] result = new long[strings.length - 1];

        for (int i = 1; i < strings.length; i++) {
            result[i - 1] = Integer.parseInt(strings[i]);
        }

        return result;

    }
}
