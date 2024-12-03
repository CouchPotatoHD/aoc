package com.ismaylov.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Solving solving = new Solving();

        List<Report> list = new ArrayList<>();

        try (BufferedReader reader = Files.newBufferedReader(Path.of("2024/src/main/resources/day2Source.txt"))) {
            reader
                    .lines()
                    .forEach(s -> {
                        String[] res = s.split("\\s+");
                        list.add(new Report(Arrays.stream(res).mapToInt(Integer::parseInt).boxed().toList()));
                    });

            System.out.println("Without dampener: " + solving.safeReportsCount(list, false));
            System.out.println("With dampener: " + solving.safeReportsCount(list, true));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}