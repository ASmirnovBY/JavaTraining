package by.smirnov.task10.task2.service.impl;

import by.smirnov.task10.task2.dao.HolidaysDAO;
import by.smirnov.task10.task2.dao.exception.DAOException;
import by.smirnov.task10.task2.dao.factory.DAOFactory;
import by.smirnov.task10.task2.entity.Calendar;
import by.smirnov.task10.task2.entity.DayOfCalendar;
import by.smirnov.task10.task2.service.CalendarService;
import by.smirnov.task10.task2.service.exception.ServiceException;
import by.smirnov.task10.task2.utils.request.ResponseMessage;

import java.util.Set;

public class CalendarServiceImpl implements CalendarService {

    @Override
    public Calendar addHolidayInCalendar(int year, String country) throws ServiceException {
        Calendar calendar = new Calendar(year);
        DAOFactory factory = DAOFactory.getInstance();
        HolidaysDAO holidaysDAO = factory.getHolidaysDAO();
        Set<DayOfCalendar> read = null;
        try {
            read = holidaysDAO.read(year, country);
        } catch (DAOException e) {
            throw new ServiceException(e.getMessage(), e);
        }
        read.forEach(day -> {
            calendar.addHoliday(day);
        });
        return calendar;
    }

    @Override
    public Calendar buildWorkDaysCalendar(int year) throws ServiceException {
        if (year < 2019
                || year > 2056) {
            throw new ServiceException(ResponseMessage.INCORRECT_INPUT_YEAR.getMessage());
        }
        Calendar calendar = new Calendar(year);
        calendar.buildWorkDay();
        return calendar;
    }

    @Override
    public Calendar buildWeekendDaysCalendar(int year) throws ServiceException {
        if (year < 2019
                || year > 2056) {
            throw new ServiceException(ResponseMessage.INCORRECT_INPUT_YEAR.getMessage());
        }
        Calendar calendar = new Calendar(year);
        calendar.buildWeekendDay();
        return calendar;
    }

    @Override
    public Calendar buildWorkWeekendDaysCalendar(int year) throws ServiceException {
        if (year < 2019
                || year > 2056) {
            throw new ServiceException(ResponseMessage.INCORRECT_INPUT_YEAR.getMessage());
        }
        Calendar calendar = new Calendar(year);
        calendar.buildWorkAndWeekendDays();
        return calendar;
    }

}
