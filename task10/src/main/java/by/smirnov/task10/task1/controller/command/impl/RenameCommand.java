package by.smirnov.task10.task1.controller.command.impl;

import by.smirnov.task10.task1.controller.command.Command;
import by.smirnov.task10.task1.entity.TextFile;
import by.smirnov.task10.task1.service.TextFileService;
import by.smirnov.task10.task1.service.exception.FileServiceException;
import by.smirnov.task10.task1.service.factory.ServiceFactory;
import by.smirnov.task10.task1.utils.builder.FileDirector;
import by.smirnov.task10.task1.utils.builder.TextFileBuilderImpl;

public class RenameCommand implements Command {

    @Override
    public String fileExecute(String request) {
        String[] requestParam = request.split("&");
        ServiceFactory factory = ServiceFactory.getINSTANCE();
        TextFileService textFileService = factory.getTextFileService();
        TextFile oldTextFile = (TextFile) FileDirector.createFile(new TextFileBuilderImpl(request));
        String newFileName = "";
        try {
            newFileName = requestParam[2];
            textFileService.renameFile(oldTextFile, newFileName);
        } catch (FileServiceException e) {
            return "File not rename";
        } catch (ArrayIndexOutOfBoundsException e) {
            return "File not rename wrong request param";
        }
        return "File rename " + newFileName +".txt";
    }
}
