package org.bvm.aoc.reader;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class FileReader {

    private final String filename;

    public FileReader(String filename) {
        this.filename = filename;
    }

    public List<String> read() {
        Scanner input = getScannerObject();
        List<String> list = new ArrayList<>();

        while (input.hasNextLine()) {
            list.add(input.nextLine().strip().replace("\n", ""));
        }
        return list;
    }

    public <T> List<T> read(Function<String, T> applyToLine) {
        Scanner input = getScannerObject();
        List<T> result = new ArrayList<>();
        while (input.hasNextLine()) {
            String line = input.nextLine().strip().replace("\n", "");
            result.add(applyToLine.apply(line));
        }

        return result;
    }

    private Scanner getScannerObject() {
        InputStream fileStream = getClass().getClassLoader().getResourceAsStream(filename);
        assert fileStream != null;

        return new Scanner(fileStream);
    }

    public static FileReader fileReader(String filename) {
        return new FileReader(filename);
    }

}
