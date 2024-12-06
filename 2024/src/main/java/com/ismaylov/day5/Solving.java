package com.ismaylov.day5;

import org.apache.commons.math3.util.Pair;

import java.util.*;

public class Solving {

    public int findCorrectPagesMiddleValue(List<int[]> pairs, List<List<Integer>> pages) {

        List<Pair<Integer, Integer>> rulesList = generateRulesList(pairs);

        int result = 0;

        for (List<Integer> page : pages) {
            if (isCorrect(rulesList, page)) {
                int i = page.size() / 2;
                result += page.get(i);
            }
        }

        return result;

    }

    public int findIncorrectPagesMiddleValue(List<int[]> pairs, List<List<Integer>> pages) {

        int result = 0;

        Map<Integer, List<Integer>> graph = new HashMap<>();
        Set<Integer> allNodes = new HashSet<>();

        // step 1: initialize graph
        for (int[] pair : pairs) {
            int u = pair[0], v = pair[1];
            graph.putIfAbsent(u, new ArrayList<>());
            graph.get(u).add(v);
            allNodes.add(u);
            allNodes.add(v);
        }

        // step 2: topological sort
        List<Integer> topologicalOrder = topologicalSort(graph, allNodes);

        return result;
    }

    private List<Integer> topologicalSort(Map<Integer, List<Integer>> graph, Set<Integer> allNodes) {

        return null;
    }

    boolean isCorrect(List<Pair<Integer, Integer>> rulesList, List<Integer> page) {

        for (Pair<Integer, Integer> rule : rulesList) {

            int indexOfFirst = page.indexOf(rule.getFirst());
            int indexOfSecond = page.indexOf(rule.getSecond());

            if ((indexOfFirst > -1 && indexOfFirst > indexOfSecond) && indexOfSecond > -1) {
                return false;
            }
        }
        return true;
    }

    List<Pair<Integer, Integer>> generateRulesList(List<int[]> pairs) {

        List<Pair<Integer, Integer>> rulesList = new ArrayList<>();

        for (int[] pair : pairs) {
            rulesList.add(new Pair<>(pair[0], pair[1]));
        }

        return rulesList;

    }
}
