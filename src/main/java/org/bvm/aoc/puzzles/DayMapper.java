package org.bvm.aoc.puzzles;

import org.bvm.aoc.puzzles.day1.Day1;
import org.bvm.aoc.puzzles.day2.Day2;

import java.util.HashMap;
import java.util.Map;

public class DayMapper {

    public static Map<Integer, BaseDay> getBaseDays() {
        HashMap<Integer, BaseDay> result = new HashMap<>();
        result.put(1, new Day1());
        result.put(2, new Day2());
        return result;
    }
}
