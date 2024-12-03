package com.ismaylov.day2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Report {
    List<Integer> values;
    private static final int MAX_DIFFERENCE = 3;



}
