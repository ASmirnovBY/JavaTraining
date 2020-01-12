package by.smirnov.task10.task1.utils.builder;

import by.smirnov.task10.task1.entity.File;

public class FileDirector {
    public static File createFile(FileBaseBuilder builder) {
        builder.buildDirectory();
        builder.buildName();
        return builder.getFile();
    }
}
