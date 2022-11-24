package org.bvm.oac.util;

import org.bvm.oac.puzzles.day2.Instruction;

public class Position {
    private final int x;
    private final int y;

    private Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Position of(int x, int y) {
        return new Position(x, y);
    }

    public Position add(Position other) {
        return of(getX() + other.getX(), getY() + other.getY());
    }

    public Position applyInstruction(Instruction instruction) {
        switch (instruction.getDirection()) {
            case UP -> {
                return of(x, Math.max(0, y - instruction.getDelta()));
            }
            case DOWN -> {
                return of(x, y + instruction.getDelta());
            }
            case FORWARD -> {
                return of(x + instruction.getDelta(), y);
            }
            default -> throw new RuntimeException("Unknown Direction");
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return String.format("x: %s, y: %s", x, y);
    }
}
