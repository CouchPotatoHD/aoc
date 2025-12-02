package com.ismaylov.day1;

import java.util.function.BiFunction;

public enum ClickAndCount {

    LEFT((x, y) ->
    {
        int loopCount = 0;
        if (y == 0) {
            loopCount = x / 100;
        } else if (x >= y) {
            loopCount = (x - y) / 100 + 1;
        }

        ClickAndCountResult clickAndCountResult = new ClickAndCountResult();
        clickAndCountResult.setLoopCount(loopCount);
        clickAndCountResult.setY((((y - x) % 100) + 100) % 100);
        return clickAndCountResult;

    }),
    RIGHT((x, y) ->
    {
        int loopCount = 0;
        if (y+x > 99){
            if (x > 99){
                loopCount = (y + x) / 100;
            }else if (y != 0){
                loopCount++;
            }
        }

        ClickAndCountResult clickAndCountResult = new ClickAndCountResult();
        clickAndCountResult.setLoopCount(loopCount);
        clickAndCountResult.setY((y + x) % 100);
        return clickAndCountResult;
    });

    public final BiFunction<Integer, Integer, ClickAndCountResult> clickCalculation;

    ClickAndCount(BiFunction<Integer, Integer, ClickAndCountResult> function) {
        this.clickCalculation = function;
    }

}