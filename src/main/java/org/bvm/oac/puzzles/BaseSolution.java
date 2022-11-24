package org.bvm.oac.puzzles;

public class  BaseSolution<T> {
    T solution;

    public BaseSolution(T solution) {
        this.solution = solution;
    }

    public String getSolutionString() {
        return solution.toString();
    }

    public void print() {
        printBox(getSolutionString());
    }

    private static int getMaxLength(String... strings) {
        int len = Integer.MIN_VALUE;
        for (String str : strings) {
            len = Math.max(str.length(), len);
        }
        return len;
    }

    private static String padString(String str, int len) {
        return str + fill(' ', len - str.length());
    }

    private static String fill(char ch, int len) {
        return String.valueOf(ch).repeat(Math.max(0, len));
    }

    private static void printBox(String... strings) {
        int maxBoxWidth = getMaxLength(strings);
        String line = "+" + fill('-', maxBoxWidth + 2) + "+";
        System.out.println(line);
        for (String str : strings) {
            System.out.printf("| %s |%n", padString(str, maxBoxWidth));
        }
        System.out.println(line);
    }

    public static <T> void printSolution(T solution) {
        new BaseSolution<T>(solution).print();
    }
}
