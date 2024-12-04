package com.ismaylov.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Solving solving = new Solving();

        List<Long> list1 = new ArrayList<>();
        List<Long> list2 = new ArrayList<>();

        try (BufferedReader reader = Files.newBufferedReader(Path.of("2024/src/main/resources/day1Source.txt"))) {

            reader
                    .lines()
                    .forEach(s -> {
                        String[] res = s.split("\\s+");
                        list1.add(Long.parseLong(res[0]));
                        list2.add(Long.parseLong(res[1]));
                    });

            System.out.println(solving.pairUpLists(list1, list2));
            System.out.println(solving.pairUpListsWithMultiplying(list1, list2));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}