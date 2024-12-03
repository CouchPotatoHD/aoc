package com.ismaylov.day2;

import java.util.ArrayList;
import java.util.List;

public class Solving {

    private static final int MAX_DIFF = 3;
  
    public int safeReportsCount(List<List<Integer>> reports, boolean problemDampener) {

        int result = 0;
        for (List<Integer> report : reports) {
            if (problemDampener) {
                boolean safe = isSafeWithDampener(report);
                if (safe) {
                    System.out.println(report);
                }
                result += safe ? 1 : 0;
            } else {
                result += isSafe(report) ? 1 : 0;
            }
        }

        return result;

    }


    public static boolean isSafe(List<Integer> values) {
        List<Integer> diffs = new ArrayList<>();
        for (int i = 0; i < values.size() - 1; i++) {
            diffs.add(values.get(i) - values.get(i + 1));
        }

        boolean allPositive = diffs.stream().allMatch(diff -> diff > 0 && diff <= MAX_DIFF);
        boolean allNegative = diffs.stream().allMatch(diff -> diff >= -MAX_DIFF && diff < 0);

        return allPositive || allNegative;
    }

    public static boolean isSafeWithDampener(List<Integer> values) {

        for (int idx = 0; idx < values.size(); idx++) {
            List<Integer> trimmedLevels = new ArrayList<>(values);
            trimmedLevels.remove(idx);

            if (isSafe(trimmedLevels)) {
                return true;
            }
        }

        return false;

    }

}
