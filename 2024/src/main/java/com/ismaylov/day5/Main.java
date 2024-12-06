package com.ismaylov.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) {

        Solving solving = new Solving();

        try (BufferedReader reader = Files.newBufferedReader(Path.of("2024/src/main/resources/day5Source.txt"))) {

            List<int[]> pairs = new ArrayList<>();

            reader.lines().forEach(line -> {
                String[] splitted = line.split("\\|");
                int[] pair = new int[2];
                pair[0] = Integer.parseInt(splitted[0]);
                pair[1] = Integer.parseInt(splitted[1]);
                pairs.add(pair);
            });

            try(BufferedReader reader2 = Files.newBufferedReader(Path.of("2024/src/main/resources/day5Source_pt2.txt")))
            {

                List<List<Integer>> list = reader2.lines()
                        .map(line -> Arrays.stream(line.split(","))
                                .map(Integer::parseInt)
                                .collect(toList()))
                        .collect(toList());

                //first part
                System.out.println(solving.findCorrectPagesMiddleValue(pairs, list));

                //second part
                System.out.println(solving.findIncorrectPagesMiddleValue(pairs, list));
            }


        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
    }
}
