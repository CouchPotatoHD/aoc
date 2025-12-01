package com.ismaylov.day1;

import java.util.List;

public class Solving {

    public int getNumberOfTimesSetToZero(List<Command> commands){

        int y = 50;
        int numberOfTimesSetToZero = 0;

        for (Command command : commands){
            if (command.getDirection().equals("L")){
                y = Click.LEFT.clickCalculation.apply(command.getDistance(), y);
            }
            if (command.getDirection().equals("R")){
                y = Click.RIGHT.clickCalculation.apply(command.getDistance(), y);
            }
            if (y == 0){
                numberOfTimesSetToZero++;
            }
        }

        return numberOfTimesSetToZero;
    }

}
