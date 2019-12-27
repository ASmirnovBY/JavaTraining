package by.smirnov.oop.apphospital.database.utils;

public enum FileDataBasePath {
    PATIENT_FILE_PATH("src/main/java/by/smirnov/oop/apphospital/database/patients.txt");

    private final String path;

    FileDataBasePath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
