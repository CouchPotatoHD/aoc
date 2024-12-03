package com.ismaylov.day1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solving {

    public long pairUpLists(List<Long> firstList, List<Long> secondList) {

        long result = 0;

        firstList.sort(Long::compareTo);
        secondList.sort(Long::compareTo);

        for (int i = 0; i < firstList.size(); i++) {
            result += Math.absExact(firstList.get(i) - secondList.get(i));
        }
        return result;
    }

    public long pairUpListsWithMultiplying(List<Long> firstList, List<Long> secondList){

        long result = 0;

        for (Long l : firstList) {
            result += l * countTotalOccurrences(l, secondList);
        }

        return result;
    }

    private long countTotalOccurrences(long value, List<Long> list){

        return list
                .stream()
                .filter(val -> val == value)
                .count();
    }
}
