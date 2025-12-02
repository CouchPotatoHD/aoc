package com.ismaylov.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class ParseInput {

    public static void main(String[] args) {
        Solving solving = new Solving();

        List<Command> commands = new ArrayList<>();

        try (BufferedReader reader = Files.newBufferedReader(Path.of("2025/src/main/resources/day1Source.txt"))) {
            reader
                    .lines()
                    .forEach(s -> {
                        Command command = new Command(
                                s.substring(0, 1),
                                Integer.parseInt(s.substring(1))
                        );
                        commands.add(command);
                    });

            //System.out.println("Number of times set to zero is: " + solving.getNumberOfTimesSetToZero(commands));
            System.out.println("Number of times passed zero is: " + solving.getNumberOfTimesPassedZero(commands));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
