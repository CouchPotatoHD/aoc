package com.ismaylov.day6;

import java.util.function.Function;

public enum Directions implements Turning {

    UP((curr) -> new Point(curr.x() - 1, curr.y())) {
        @Override
        public Directions turn() {
            return Directions.RIGHT;
        }
    },
    DOWN((curr) -> new Point(curr.x() + 1, curr.y())) {
        @Override
        public Directions turn() {
            return Directions.LEFT;
        }
    },
    LEFT((curr) -> new Point(curr.x(), curr.y() - 1)) {
        @Override
        public Directions turn() {
            return Directions.UP;
        }
    },
    RIGHT((curr) -> new Point(curr.x(), curr.y() + 1)) {
        @Override
        public Directions turn() {
            return Directions.DOWN;
        }
    };

    public final Function<Point, Point> direction;

    Directions(Function<Point, Point> direction) {
        this.direction = direction;
    }
}
