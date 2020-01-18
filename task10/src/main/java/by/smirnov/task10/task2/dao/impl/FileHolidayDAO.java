package by.smirnov.task10.task2.dao.impl;

import by.smirnov.task10.task2.dao.HolidaysDAO;
import by.smirnov.task10.task2.dao.exception.DAOException;
import by.smirnov.task10.task2.db.utils.HolidayCountryDays;
import by.smirnov.task10.task2.entity.DayOfCalendar;
import by.smirnov.task10.task2.utils.parser.HolidaysParser;
import by.smirnov.task10.task2.utils.parser.exception.ParserException;
import by.smirnov.task10.task2.utils.parser.impl.FileHolidaysParser;
import by.smirnov.task10.task2.utils.request.ResponseMessage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class FileHolidayDAO implements HolidaysDAO {

    @Override
    public Set<DayOfCalendar> read(int year, String country) throws DAOException {
        Set<DayOfCalendar> holidays = new TreeSet<>();
        List<String> holidaysFromfile;
        HolidayCountryDays countryDays = null;

        try {
           countryDays = HolidayCountryDays.valueOf(country.toUpperCase());
           holidaysFromfile = Files.
                    lines(Paths.get(countryDays.getPath()))
                    .collect(Collectors.toList());
        } catch (IllegalArgumentException e) {
            throw new DAOException(ResponseMessage.INVALID_COUNTRY.getMessage(), e);
        }
        catch (IOException e) {
           throw new DAOException(ResponseMessage.DB.getMessage(), e);
        }

        if (!holidaysFromfile.isEmpty()) {
            HolidaysParser holidayParser = new FileHolidaysParser();
            for (String lineParam
                    : holidaysFromfile) {
                DayOfCalendar day = null;
                try {
                    day = holidayParser.parse(lineParam, year);
                } catch (ParserException e) {
                    throw new DAOException(ResponseMessage.BAD_FILE.getMessage(), e);
                }
                holidays.add(day);
            }
        }
        return holidays;
    }
}
