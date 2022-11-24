package org.bvm.oac.puzzles.day1;

import org.bvm.oac.puzzles.BaseSolution;

import java.util.List;
import java.util.stream.IntStream;

import static org.bvm.oac.reader.FileReader.fileReader;

public class First {

    public static void main(String[] args) {
        List<Integer> input = fileReader("input-1.1").read(Integer::parseInt);
        long sol = IntStream.range(0, input.size() - 1).filter(i -> input.get(i) < input.get(i + 1)).count();
        BaseSolution.printSolution(sol);
    }
}
