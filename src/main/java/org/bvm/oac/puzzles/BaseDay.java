package org.bvm.oac.puzzles;

import org.bvm.oac.reader.FileReader;

public abstract class BaseDay {
    private FileReader reader;
    private final int day;

    public BaseDay(int day) {
        this.day = day;
        this.reader = FileReader.fileReader(String.format("input-%s.1", day));
    }

    public void setSecondInput() {
        this.reader = FileReader.fileReader(String.format("input-%s.2", day));
    }

    public FileReader fileReader() {
        return reader;
    }

    public abstract BaseSolution computeFirstPart();
    public abstract BaseSolution computeSecondPart();

    @Override
    public String toString() {
        String result = String.format("---------- Day %s -------------\n", day);
        result += computeFirstPart().toString();
        result += computeSecondPart().toString();
        return result;
    }
}
