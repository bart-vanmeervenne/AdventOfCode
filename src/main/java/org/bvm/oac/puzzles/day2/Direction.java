package org.bvm.oac.puzzles.day2;

import java.util.Arrays;

public enum Direction {
    FORWARD("forward"),
    UP("up"),
    DOWN("down"),
    BACK("back");

    private final String direction;
    Direction(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public static Direction getDirection(String name) {
        return Arrays.stream(values()).filter(d -> d.getDirection().equals(name)).findFirst().orElseThrow();
    }
}
