package com.ismaylov.day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Solving solving = new Solving();

        try (BufferedReader reader = Files.newBufferedReader(Path.of("2024/src/main/resources/day6Source.txt"))) {

            List<String> list = reader.lines().toList();
            char[][] grid = new char[list.size()][list.getFirst().length()];

            for (int i = 0; i < list.size(); i++) {
                String[] splitted = list.get(i).split("");
                for (int j = 0; j < splitted.length; j++) {
                    grid[i][j] = splitted[j].toCharArray()[0];
                }
            }

            //first part
            System.out.println(solving.distinctVisitedPositions(grid, new int[]{89,74}));

            //second part
            //System.out.println(solving.);


        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
    }
}
