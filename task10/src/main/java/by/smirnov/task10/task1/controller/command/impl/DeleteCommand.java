package by.smirnov.task10.task1.controller.command.impl;

import by.smirnov.task10.task1.controller.command.Command;
import by.smirnov.task10.task1.entity.TextFile;
import by.smirnov.task10.task1.service.TextFileService;
import by.smirnov.task10.task1.service.exception.FileServiceException;
import by.smirnov.task10.task1.service.factory.ServiceFactory;
import by.smirnov.task10.task1.utils.builder.FileDirector;
import by.smirnov.task10.task1.utils.builder.TextFileBuilderImpl;

public class DeleteCommand implements Command {

    @Override
    public String fileExecute(String request) {
        ServiceFactory factory = ServiceFactory.getINSTANCE();
        TextFileService textFileService = factory.getTextFileService();
        TextFile textFile = (TextFile) FileDirector.createFile(new TextFileBuilderImpl(request));
        try {
            textFileService.deleteFile(textFile);
        } catch (FileServiceException e) {
            return "No delete";
        }
        return "Delete";
    }
}
