package by.smirnov.loops.ex1.services.algorithm.enums;

public enum SumAlgorithmEnum {
    SIMPLE_LOOP("Simple"),
    RECURSION("Recursion");

    private String title;

    private SumAlgorithmEnum(String title) {
        this.title = title;
    }

    private String getTitle() {
        return title;
    }
}
