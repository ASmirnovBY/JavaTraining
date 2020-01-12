package by.smirnov.task10.task1.service.impl;

import by.smirnov.task10.task1.entity.TextFile;
import by.smirnov.task10.task1.service.TextFileService;
import by.smirnov.task10.task1.service.exception.FileServiceException;
import java.io.IOException;


public class TextFileServiceImpl implements TextFileService {

    @Override
    public void createNewFile(TextFile textFile) throws FileServiceException {
        try {
            textFile.createNewFile();
        } catch (IOException e) {
            throw new FileServiceException("Сould not create file", e);
        }
    }

    @Override
    public void deleteFile(TextFile textFile) throws FileServiceException {
            if(!textFile.deleteFile()) {
                throw new FileServiceException("Could not delete file");
            }
    }

    @Override
    public void renameFile(TextFile textFile, String newName) throws FileServiceException {
        if(!textFile.renameFile(newName)) {
            throw new FileServiceException("Could not rename file");
        }
    }

    @Override
    public String readFile(TextFile textFile) throws FileServiceException {
        try {
            return textFile.readFile();
        } catch (IOException e) {
            throw new FileServiceException("File not found");
        }
    }

    @Override
    public void addToFile(TextFile textFile, String text) throws FileServiceException {
        try {
            textFile.addToFile(text);
        } catch (IOException e) {
            throw new FileServiceException("Error");
        }
    }
}
