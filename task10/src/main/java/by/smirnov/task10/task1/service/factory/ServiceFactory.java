package by.smirnov.task10.task1.service.factory;

import by.smirnov.task10.task1.service.TextFileService;
import by.smirnov.task10.task1.service.impl.TextFileServiceImpl;

public class ServiceFactory {
    private static final ServiceFactory INSTANCE = new ServiceFactory();

    private final TextFileService textFileService = new TextFileServiceImpl();

    private ServiceFactory(){}

    public static ServiceFactory getINSTANCE() {
        return INSTANCE;
    }

    public TextFileService getTextFileService() {
        return textFileService;
    }
}
