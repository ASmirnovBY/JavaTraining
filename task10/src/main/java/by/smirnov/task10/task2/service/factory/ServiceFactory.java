package by.smirnov.task10.task2.service.factory;

import by.smirnov.task10.task2.service.CalendarService;
import by.smirnov.task10.task2.service.impl.CalendarServiceImpl;

public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private final CalendarService calendarService = new CalendarServiceImpl();

    private ServiceFactory() {}

    public static ServiceFactory getInstance() {
        return instance;
    }

    public CalendarService getCalendarService() {
        return calendarService;
    }
}
