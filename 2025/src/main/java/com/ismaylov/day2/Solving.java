package com.ismaylov.day2;

import java.util.List;

public class Solving {

    public long sumOfInvalidIds(List<Range> rangeList) {
        long sum = 0;
        for (Range range : rangeList) {
            sum += findInvalidIdsInRange(range.getFrom(), range.getTo());
        }
        return sum;
    }


    private long findInvalidIdsInRange(long from, long to) {
        long sum = 0;

        int maxDigits = String.valueOf(to).length();

        for (int totalDigits = 2; totalDigits <= maxDigits + 1; totalDigits += 2) {
            int halfDigits = totalDigits / 2;
            long multiplier = (long) Math.pow(10, halfDigits) + 1;

            long minNumber = Math.max(
                    (long) Math.pow(10, halfDigits - 1),
                    (from + multiplier - 1) / multiplier
            );

            long maxNumber = Math.min(
                    (long) Math.pow(10, halfDigits) - 1,
                    to / multiplier
            );

            for (long n = minNumber; n <= maxNumber; n++) {
                long repeatedNum = n * multiplier;
                if (repeatedNum >= from && repeatedNum <= to) {
                    sum += repeatedNum;
                }
            }
        }

        return sum;
    }

}
