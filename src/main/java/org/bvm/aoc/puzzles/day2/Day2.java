package org.bvm.aoc.puzzles.day2;

import org.bvm.aoc.puzzles.BaseDay;
import org.bvm.aoc.puzzles.BaseSolution;
import org.bvm.aoc.util.Position;

import java.util.List;

public class Day2 extends BaseDay {
    public Day2() {
        super(2);
    }

    @Override
    public BaseSolution<Integer> computeFirstPart() {
        List<Instruction> instructions = fileReader().read(c -> {
            String[] comps = c.split(" ");
            return new Instruction(Direction.getDirection(comps[0]), Integer.parseInt(comps[1]));
        });
        Position result = instructions.stream().reduce(Position.of(0,0), Position::applyInstruction, Position::add);

        return new BaseSolution<>(result.getX() * result.getY());
    }

    @Override
    public BaseSolution<Integer> computeSecondPart() {
        return new BaseSolution<>(0);
    }
}
