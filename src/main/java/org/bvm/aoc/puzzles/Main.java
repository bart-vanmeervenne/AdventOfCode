package org.bvm.aoc.puzzles;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int nrDays = 25;
        try {
            nrDays = Integer.parseInt(args[0]);
        } catch (Exception e) {
            // do nothing;
        }

        final int firstXDays = nrDays;

        Collection<BaseDay> days = DayMapper.getBaseDays().entrySet().stream()
                .sorted(Comparator.comparingInt(Map.Entry::getKey))
                .filter(c -> c.getKey() <= firstXDays)
                .map(Map.Entry::getValue)
                .toList();

        System.out.println(days.stream()
                .map(BaseDay::toString)
                .filter(s -> !s.isEmpty())
                .collect(Collectors.joining("\n")));
    }
}