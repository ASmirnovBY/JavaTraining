package by.smirnov.task10.task2.service;

import by.smirnov.task10.task2.entity.Calendar;
import by.smirnov.task10.task2.service.exception.ServiceException;

public interface CalendarService {
    Calendar addHolidayInCalendar(int year, String countryHoliday) throws ServiceException;
    Calendar buildWorkDaysCalendar(int year) throws ServiceException;
    Calendar buildWeekendDaysCalendar(int year) throws ServiceException;
    Calendar buildWorkWeekendDaysCalendar(int year) throws ServiceException;
}
