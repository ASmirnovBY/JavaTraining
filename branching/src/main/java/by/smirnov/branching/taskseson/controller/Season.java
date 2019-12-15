package by.smirnov.branching.taskseson.controller;

public enum Season {
    WINTER("Winter"),
    SPRING("Spring"),
    SUMMER("Summer"),
    FALL("Fall");

    private String seasonText;

    private Season(String seasonText) {
        this.seasonText = seasonText;
    }

    public String getSeasonText() {
        return seasonText;
    }
}
