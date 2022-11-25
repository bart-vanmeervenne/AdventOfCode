package org.bvm.aoc.puzzles;

import java.util.Collection;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Collection<BaseDay> days = DayMapper.getBaseDays().values();
        System.out.println(days.stream()
                .map(BaseDay::toString)
                .collect(Collectors.joining("\n")));
    }
}