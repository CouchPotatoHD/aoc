package com.ismaylov.day6;

import java.util.HashSet;
import java.util.Set;

public class Solving {

    public int distinctVisitedPositions(char[][] grid, int[] startingPosition) {

        Directions currentDirection = Directions.UP;

        Set<Point> visited = new HashSet<>();

        int i = startingPosition[0];
        int j = startingPosition[1];

        grid[startingPosition[0]][startingPosition[1]] = '.';

        while (i > 0 && j > 0 && i < grid.length - 1 && j < grid[0].length - 1) {

            visited.add(new Point(i, j));

            Point nextPoint = currentDirection.direction.apply(new Point(i, j));

            if (grid[nextPoint.x()][nextPoint.y()] == '.') {

                i = nextPoint.x();
                j = nextPoint.y();

            } else if (grid[nextPoint.x()][nextPoint.y()] == '#') {
                currentDirection = currentDirection.turn();
            }

        }
        return visited.size() + 1;

    }

}