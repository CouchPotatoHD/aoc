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

    public int getNumberOfTimesPassedZero(List<Command> commands){

        int y = 50;
        int numberOfTimesSetToZero = 0;

        for (Command command : commands){
            if (command.getDirection().equals("L")){
                ClickAndCountResult result = ClickAndCount.LEFT.clickCalculation.apply(command.getDistance(), y);
                y = result.getY();
                numberOfTimesSetToZero += result.getLoopCount();
            }
            if (command.getDirection().equals("R")){
                ClickAndCountResult result = ClickAndCount.RIGHT.clickCalculation.apply(command.getDistance(), y);
                y = result.getY();
                numberOfTimesSetToZero += result.getLoopCount();
            }

        }

        return numberOfTimesSetToZero;
    }

}
