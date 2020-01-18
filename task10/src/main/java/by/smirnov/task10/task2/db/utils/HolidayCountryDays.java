package by.smirnov.task10.task2.db.utils;

public enum HolidayCountryDays {
    BELARUS("src/main/java/by/smirnov/task10/task2/db/files/belarus.txt"),
    RUSSIA("src/main/java/by/smirnov/task10/task2/db/files/russia.txt");

    private String path;

    HolidayCountryDays(String path) {
       this.path = path;
    }

    public String getPath() {
        return path;
    }
}
