package org.bvm.oac.puzzles.day1;

public class Window {
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
