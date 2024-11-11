package com.ismaylov.day2;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solving {

    public boolean possibleGame(Map<Colour, Integer> coloursAndCount, Game game) {

        for (Map<Colour, Integer> colourIntegerMap : game.colourCountSet) {
            for (Colour colour : coloursAndCount.keySet()) {
                if (colourIntegerMap.get(colour) != null && colourIntegerMap.get(colour) > coloursAndCount.get(colour)) {
                    return false;
                }
            }
        }
        return true;
    }

    public Long possibleGame2(Game game) {
        updateGameWithPowerOfSumOfCubes(game);
        return game.fewestCubesSum;
    }

    public Game parseGame(String input) {

        Set<Map<Colour, Integer>> coloursAndCountSet = new HashSet<>();

        String[] parts = input.split(":");
        int gameNumber = Integer.parseInt(parts[0].split(" ")[1].trim());
        String[] rounds = parts[1].split(";");


        for (String round : rounds) {
            Map<Colour, Integer> colourCountMap = new EnumMap<>(Colour.class);
            String[] tokens = round.split(",");
            for (String token : tokens) {
                String trimmedToken = token.trim();
                Matcher matcher = Pattern.compile("(\\d+)\\s(\\w+)").matcher(trimmedToken);

                if (matcher.find()) {
                    int count = Integer.parseInt(matcher.group(1));
                    String colourName = matcher.group(2).toLowerCase();

                    for (Colour colour : Colour.values()) {
                        if (colour.name.equals(colourName)) {
                            colourCountMap.put(colour, colourCountMap.getOrDefault(colour, 0) + count);
                        }
                    }
                }
            }
            coloursAndCountSet.add(colourCountMap);
        }

        Game game = new Game();
        game.number = gameNumber;
        game.colourCountSet = coloursAndCountSet;
        return game;
    }

    void updateGameWithPowerOfSumOfCubes(Game game) {

        Map<Colour, Integer> biggestColourMap = new EnumMap<>(Colour.class);

        for (Map<Colour, Integer> colourIntegerMap : game.colourCountSet) {

            for (Colour colour : colourIntegerMap.keySet()) {

                if (biggestColourMap.get(colour) == null) {
                    biggestColourMap.put(colour, colourIntegerMap.get(colour));
                } else if (biggestColourMap.get(colour) < colourIntegerMap.get(colour)) {
                    biggestColourMap.put(colour, colourIntegerMap.get(colour));
                }
            }
        }

        game.fewestCubesSum = biggestColourMap
                .values()
                .stream()
                .mapToLong(Long::valueOf)
                .reduce((int1, int2) -> int1 * int2)
                .orElse(0);
    }
}
