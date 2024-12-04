package com.ismaylov.day4;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class Solving {

   private static final char[] WORD = {'X', 'M', 'A', 'S'};
    private static final char[] MAS = {'M', 'A', 'S'};
    private static final char[] SAM = {'S', 'A', 'M'};

    public int findXMasShapes(char[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length - 1; i++) { // Avoid edges
            for (int j = 0; j < grid[i].length - 1; j++) {
                if (isXMas(grid, i, j)) {
                    count++;
                }
            }
        }

        return count;
    }

    private boolean isXMas(char[][] grid, int x, int y) {
        return (matchesMas(grid, x, y, 1, 1) || matchesSam(grid, x, y, 1, 1)) && // top-left to bottom-right MAS and SAM
                (matchesMas(grid, x, y + 2, 1, -1) || matchesSam(grid, x, y + 2, 1, -1));  // bottom-left to top-right MAS and SAM
    }

    private boolean matchesMas(char[][] grid, int x, int y, int dx, int dy) {
        for (char c : MAS) {
            if (x < 0 || y < 0 || x >= grid.length || y >= grid[x].length || grid[x][y] != c) {
                return false;
            }
            x += dx;
            y += dy;
        }
        return true;
    }

    private boolean matchesSam(char[][] grid, int x, int y, int dx, int dy) {
        for (char c : SAM) {
            if (x < 0 || y < 0 || x >= grid.length || y >= grid[x].length || grid[x][y] != c) {
                return false;
            }
            x += dx;
            y += dy;
        }
        return true;
    }

        public int findXmas(char[][] grid) {
            int countXmas = 0;
            Set<Pair<Point, Point>> foundMatches = new HashSet<>();

            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    countXmas += search(grid, i, j, 0, 1, foundMatches);  // horizontal right
                    countXmas += search(grid, i, j, 0, -1, foundMatches); // horizontal left
                    countXmas += search(grid, i, j, 1, 0, foundMatches);  // vertical down
                    countXmas += search(grid, i, j, -1, 0, foundMatches); // vertical up
                    countXmas += search(grid, i, j, 1, 1, foundMatches);  // diagonal down-right
                    countXmas += search(grid, i, j, -1, -1, foundMatches);// diagonal up-left
                    countXmas += search(grid, i, j, 1, -1, foundMatches); // diagonal down-left
                    countXmas += search(grid, i, j, -1, 1, foundMatches); // diagonal up-right
                }
            }
            return countXmas;
        }

        private int search(char[][] grid, int x, int y, int dx, int dy, Set<Pair<Point, Point>> points) {
            int rows = grid.length;
            int cols = grid[0].length;

            int endX = x + dx * (WORD.length - 1);
            int endY = y + dy * (WORD.length - 1);

            if (endX < 0 || endX >= rows || endY < 0 || endY >= cols) {
                return 0;
            }

            for (int i = 0; i < WORD.length; i++) {
                if (grid[x + i * dx][y + i * dy] != WORD[i]) {
                    return 0;
                }
            }

            Pair<Point, Point> match = new Pair<>(new Point(x, y), new Point(endX, endY));
            if (points.add(match)) {
                return 1;
            }
            return 0;
        }

        public static class Pair<T, U> {
            public final T first;
            public final U second;

            public Pair(T first, U second) {
                this.first = first;
                this.second = second;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Pair<?, ?> pair = (Pair<?, ?>) o;
                return first.equals(pair.first) && second.equals(pair.second);
            }

            @Override
            public int hashCode() {
                return 31 * first.hashCode() + second.hashCode();
            }
        }
    }
