package org.bvm.aoc.puzzles.day2;

public class Instruction {
    Direction direction;
    int delta;

    public Instruction(Direction direction, int delta) {
        this.direction = direction;
        this.delta = delta;
    }

    public Direction getDirection() {
        return direction;
    }

    public int getDelta() {
        return delta;
    }
}
