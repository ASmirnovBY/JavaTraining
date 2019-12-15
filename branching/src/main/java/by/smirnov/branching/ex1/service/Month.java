package by.smirnov.branching.ex1.service;

public enum Month {
    JANUARY(31, 1),
    FEBRUARY(28, 2),
    MARCH(31, 3),
    APRIL(30, 4),
    MAY(31, 5),
    JUNE(30, 6),
    JULY(31, 7),
    AUGUST(31, 8),
    SEPTEMBER(30, 9),
    OCTOBER(31, 10),
    NOVEMBER(30, 11),
    DECEMBER(31, 12),
    FEBRUARYLEEP(29, 13);

    private final int days;
    private final int number;

    private Month(int days, int number) {
        this.days = days;
        this.number = number;
    }

    public int getDays() {
        return days;
    }

    public int getNumber() {
        return number;
    }
}
