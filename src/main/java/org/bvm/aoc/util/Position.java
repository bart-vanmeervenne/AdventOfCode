package org.bvm.aoc.util;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o instanceof Position p) {
            return p.getX() == getX() && p.getY() == getY();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(x) + Objects.hashCode(y);
    }
}
