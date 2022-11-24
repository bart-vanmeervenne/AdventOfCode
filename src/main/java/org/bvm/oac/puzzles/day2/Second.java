package org.bvm.oac.puzzles.day2;

import org.bvm.oac.puzzles.BaseDay;
import org.bvm.oac.puzzles.BaseSolution;
import org.bvm.oac.util.Position;

import java.util.List;

public class Second extends BaseDay {
    public Second() {
        super(2);
    }

    @Override
    public BaseSolution computeFirstPart() {
        List<Instruction> instructions = fileReader().read(c -> {
            String[] comps = c.split(" ");
            return new Instruction(Direction.getDirection(comps[0]), Integer.parseInt(comps[1]));
        });
        Position result = instructions.stream().reduce(Position.of(0,0), Position::applyInstruction, Position::add);

        return new BaseSolution(result.getX() * result.getY());
    }

    @Override
    public BaseSolution computeSecondPart() {
        return new BaseSolution<>("");
    }
}
