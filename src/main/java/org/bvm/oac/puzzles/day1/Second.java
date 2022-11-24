package org.bvm.oac.puzzles.day1;

import org.bvm.oac.puzzles.BaseSolution;

import java.util.List;
import java.util.stream.IntStream;

import static org.bvm.oac.reader.FileReader.fileReader;

public class Second {
    public static void main(String[] args) {
        List<Integer> input = fileReader("input-1.1").read(Integer::parseInt);
        int[] windows = IntStream.range(0, input.size() - 2)
                .map(i -> new Window(input.get(i), input.get(i + 1), input.get(i + 2)).sum()).toArray();
        long sol = IntStream.range(0, windows.length - 1)
                .filter(v -> windows[v] < windows[v+1]).count();
        BaseSolution.printSolution(sol);
    }

    private static class Window {
        int v1;
        int v2;
        int v3;

        public Window(int v1, int v2, int v3) {
            this.v1 = v1;
            this.v2 = v2;
            this.v3 = v3;
        }

        public int sum() {
            return v1 + v2 + v3;
        }
    }
}
