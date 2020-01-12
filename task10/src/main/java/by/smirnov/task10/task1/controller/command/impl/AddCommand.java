package by.smirnov.task10.task1.controller.command.impl;

import by.smirnov.task10.task1.controller.command.Command;
import by.smirnov.task10.task1.entity.TextFile;
import by.smirnov.task10.task1.service.TextFileService;
import by.smirnov.task10.task1.service.exception.FileServiceException;
import by.smirnov.task10.task1.service.factory.ServiceFactory;
import by.smirnov.task10.task1.utils.builder.FileDirector;
import by.smirnov.task10.task1.utils.builder.TextFileBuilderImpl;

public class AddCommand implements Command {

    @Override
    public String fileExecute(String request) {
        String[] requestParam = request.split("&");
        ServiceFactory factory = ServiceFactory.getINSTANCE();
        TextFileService textFileService = factory.getTextFileService();
        TextFile textFile = (TextFile) FileDirector.createFile(new TextFileBuilderImpl(request));
        String text = "";
        try {
            text = requestParam[2];
            textFileService.addToFile(textFile, text);
        } catch (FileServiceException e) {
           return "Not add text in file";
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Wrong request param";
        }
        return "Added text in file";
    }
}
