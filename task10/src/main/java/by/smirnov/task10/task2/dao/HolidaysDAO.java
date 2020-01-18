package by.smirnov.task10.task2.dao;

import by.smirnov.task10.task2.dao.exception.DAOException;
import by.smirnov.task10.task2.entity.DayOfCalendar;

import java.util.Set;

public interface HolidaysDAO {
    Set<DayOfCalendar> read(int year, String path) throws DAOException;
}
