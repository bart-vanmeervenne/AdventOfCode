package org.bvm.aoc.puzzles;

import org.bvm.aoc.puzzles.day1.Day1;
import org.bvm.aoc.puzzles.day10.Day10;
import org.bvm.aoc.puzzles.day11.Day11;
import org.bvm.aoc.puzzles.day12.Day12;
import org.bvm.aoc.puzzles.day13.Day13;
import org.bvm.aoc.puzzles.day14.Day14;
import org.bvm.aoc.puzzles.day15.Day15;
import org.bvm.aoc.puzzles.day16.Day16;
import org.bvm.aoc.puzzles.day17.Day17;
import org.bvm.aoc.puzzles.day18.Day18;
import org.bvm.aoc.puzzles.day19.Day19;
import org.bvm.aoc.puzzles.day2.Day2;
import org.bvm.aoc.puzzles.day20.Day20;
import org.bvm.aoc.puzzles.day21.Day21;
import org.bvm.aoc.puzzles.day22.Day22;
import org.bvm.aoc.puzzles.day23.Day23;
import org.bvm.aoc.puzzles.day24.Day24;
import org.bvm.aoc.puzzles.day25.Day25;
import org.bvm.aoc.puzzles.day3.Day3;
import org.bvm.aoc.puzzles.day4.Day4;
import org.bvm.aoc.puzzles.day5.Day5;
import org.bvm.aoc.puzzles.day6.Day6;
import org.bvm.aoc.puzzles.day7.Day7;
import org.bvm.aoc.puzzles.day8.Day8;
import org.bvm.aoc.puzzles.day9.Day9;

import java.util.HashMap;
import java.util.Map;

public class DayMapper {

    public static Map<Integer, BaseDay> getBaseDays() {
        HashMap<Integer, BaseDay> result = new HashMap<>();
        result.put(1, new Day1());
        result.put(2, new Day2());
        result.put(3, new Day3());
        result.put(4, new Day4());
        result.put(5, new Day5());
        result.put(6, new Day6());
        result.put(7, new Day7());
        result.put(8, new Day8());
        result.put(9, new Day9());
        result.put(10, new Day10());
        result.put(11, new Day11());
        result.put(12, new Day12());
        result.put(13, new Day13());
        result.put(14, new Day14());
        result.put(15, new Day15());
        result.put(16, new Day16());
        result.put(17, new Day17());
        result.put(18, new Day18());
        result.put(19, new Day19());
        result.put(20, new Day20());
        result.put(21, new Day21());
        result.put(22, new Day22());
        result.put(23, new Day23());
        result.put(24, new Day24());
        result.put(25, new Day25());
        return result;
    }
}
