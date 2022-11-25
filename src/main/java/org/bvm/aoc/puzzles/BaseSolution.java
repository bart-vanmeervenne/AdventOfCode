package org.bvm.aoc.puzzles;

public class  BaseSolution<T> {
    T solution;

    public BaseSolution(T solution) {
        this.solution = solution;
    }

    public String getSolutionString() {
        return solution.toString();
    }

    @Override
    public String toString() {
        String solutionString = getSolutionString();
        if (solutionString.trim().isEmpty()) {
            return "";
        }
        return getBoxString(getSolutionString());
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

    private static String getBoxString(String... strings) {
        int maxBoxWidth = getMaxLength(strings);
        StringBuilder result = new StringBuilder("+" + fill('-', maxBoxWidth + 2) + "+\n");
        for (String str : strings) {
            result.append(String.format("| %s |%n", padString(str, maxBoxWidth)));
        }
        result.append("+").append(fill('-', maxBoxWidth + 2)).append("+\n");
        return result.toString();
    }
}
