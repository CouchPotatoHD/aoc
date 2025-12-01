package com.ismaylov.day1;

import lombok.Data;

@Data
public class Command {

    private String direction;
    private Integer distance;

    public Command(String l, int i) {
        this.direction = l;
        this.distance = i;
    }
}
