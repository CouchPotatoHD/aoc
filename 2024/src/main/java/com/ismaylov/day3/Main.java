package com.ismaylov.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Solving solving = new Solving();

        try (BufferedReader reader = Files.newBufferedReader(Path.of("2024/src/main/resources/day3Source.txt"))) {

            long result = 0;
            List<String> list = reader.lines().toList();

            String concatenated = String.join("", list);

            //first part
//                result+=solving.multiplyCorrupted(concatenated,false);

            //second part
            result += solving.multiplyCorrupted(concatenated, true);
            System.out.println(result);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
