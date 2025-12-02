package com.ismaylov.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ParseInput {

    public static void main(String[] args) {
        Solving solving = new Solving();

        List<Range> rangeList = new ArrayList<>();

        try (BufferedReader reader = Files.newBufferedReader(Path.of("2025/src/main/resources/day2Source.txt"))) {

            String[] splitArr = reader.lines().toList().getFirst().split(",");
            for (String s : splitArr) {
                String[] splitRange = s.split("-");
                Range range = new Range(Long.parseLong(splitRange[0]), Long.parseLong(splitRange[1]));
                rangeList.add(range);
            }

            System.out.println("Sum of invalid ids is: " + solving.sumOfInvalidIds(rangeList));
            //System.out.println("Number of times passed zero is: " + solving.);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
