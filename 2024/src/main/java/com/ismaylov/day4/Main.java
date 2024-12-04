package com.ismaylov.day4;

import com.ismaylov.day4.Solving;

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


        try (BufferedReader reader = Files.newBufferedReader(Path.of("2024/src/main/resources/day4Source.txt"))) {

            List<String> list = reader.lines().toList();

            char[][] matrix = new char[list.size()][list.getFirst().length()];

            for (int i = 0; i < list.size(); i++) {
                matrix[i] = list.get(i).toCharArray();
            }

            //first part
            System.out.println(solving.findXmas(matrix));
            //second part
            System.out.println(solving.findXMasShapes(matrix));

        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }

    }



}
