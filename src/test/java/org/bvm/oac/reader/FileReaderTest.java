package org.bvm.oac.reader;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FileReaderTest {

    private final FileReader fileReader = new FileReader("testInput");

    @Test
    void read() {
        List<String> result = fileReader.read();
        assertThat(String.join("", result)).isEqualTo("12345678910");
    }

    @SuppressWarnings("OptionalGetWithoutIsPresent")
    @Test
    void testRead() {
        List<Integer> result = fileReader.read(Integer::parseInt);
        assertThat(result.stream().reduce(Integer::sum).get()).isEqualTo(55);
    }
}