package org.bvm.oac.puzzles.day1;

import org.bvm.oac.puzzles.BaseDay;
import org.bvm.oac.puzzles.BaseSolution;

import java.util.List;
import java.util.stream.IntStream;

public class First extends BaseDay {

    public First() {
        super(1);
    }

    @Override
    public BaseSolution computeFirstPart() {
        List<Integer> input = fileReader().read(Integer::parseInt);
        long result = IntStream.range(0, input.size() - 1).filter(i -> input.get(i) < input.get(i + 1)).count();
        return new BaseSolution<>(result);
    }

    @Override
    public BaseSolution computeSecondPart() {
        List<Integer> input = fileReader().read(Integer::parseInt);
        int[] windows = IntStream.range(0, input.size() - 2)
                .map(i -> new Window(input.get(i), input.get(i + 1), input.get(i + 2)).sum()).toArray();
        long sol = IntStream.range(0, windows.length - 1)
                .filter(v -> windows[v] < windows[v+1]).count();

        return new BaseSolution<>(sol);
    }
}
