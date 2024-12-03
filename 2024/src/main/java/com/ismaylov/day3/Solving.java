package com.ismaylov.day3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solving {

    public long multiplyCorrupted(String s, boolean enabler) {
        long result = 0;

        boolean isAllowed = true;

        String pattern = "mul\\((\\d+,\\d+)\\)";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);

        List<Multiply> multiplyList = new ArrayList<>();
        List<Event> events = new ArrayList<>();

        if (enabler) {

            String enablerPattern = "do\\(\\)";
            String disablerPattern = "don't\\(\\)";

            Pattern regexEnabler = Pattern.compile(enablerPattern);
            Pattern regexDisabler = Pattern.compile(disablerPattern);

            Matcher matcherEnabler = regexEnabler.matcher(s);
            Matcher matcherDisabler = regexDisabler.matcher(s);

            while (matcherEnabler.find()) {
                events.add(new Event(matcherEnabler.start(), EventTypes.ENABLER));
            }
            while (matcherDisabler.find()) {
                events.add(new Event(matcherDisabler.start(), EventTypes.DISABLER));
            }
        }

        while (matcher.find()) {
            events.add(new Event(matcher.start(), EventTypes.MULTIPLY, matcher.group(1)));
        }

        events.sort(Comparator.comparingInt(e -> e.position));

        for (Event event : events) {
            if (event.type == EventTypes.ENABLER) {
                isAllowed = true;
            } else if (event.type == EventTypes.DISABLER) {
                isAllowed = false;
            } else if (event.type == EventTypes.MULTIPLY && isAllowed) {
                multiplyList.add(new Multiply(event.value));
            }
        }

        for (Multiply multiply : multiplyList) {
            result += multiply.doMultiply();
        }

        return result;
    }
}