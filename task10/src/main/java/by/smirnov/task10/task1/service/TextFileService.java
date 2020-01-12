package by.smirnov.task10.task1.service;

import by.smirnov.task10.task1.entity.TextFile;
import by.smirnov.task10.task1.service.exception.FileServiceException;

public interface TextFileService {
    void createNewFile(TextFile textFile) throws FileServiceException;

    void deleteFile(TextFile textFile) throws FileServiceException;

    void renameFile(TextFile textFile, String newName) throws FileServiceException;

    String readFile(TextFile textFile) throws FileServiceException;

    void addToFile(TextFile textFile, String text) throws FileServiceException;

}
