package org.bvm.aoc.util;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PositionTest {

    @Test
    void of() {
        Position pos = Position.of(5, 10);
        assertThat(pos.getX()).isEqualTo(5);
        assertThat(pos.getY()).isEqualTo(10);
    }

    @Test
    void add() {
        Position pos1 = Position.of(1, 2);
        Position pos2 = Position.of(2, 4);
        Position result = pos1.add(pos2);
        assertThat(result.getX()).isEqualTo(3);
        assertThat(result.getY()).isEqualTo(6);

        assertThat(pos2.add(pos1)).isEqualTo(result);
    }

    @Test
    void equals() {
        assertThat(Position.of(1, 1)).isEqualTo(Position.of(1, 1));
    }
}