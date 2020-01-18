package by.smirnov.task10.task2.utils.parser.impl;

import by.smirnov.task10.task2.entity.DayOfCalendar;
import by.smirnov.task10.task2.utils.parser.HolidaysParser;
import by.smirnov.task10.task2.utils.parser.exception.ParserException;

import java.time.LocalDate;

public class FileHolidaysParser implements HolidaysParser {
    private static final String DElIMETR = ",";

    @Override
    public DayOfCalendar parse(String strDay, int inputYear) throws ParserException {
        String[] param = strDay.split(DElIMETR);
        LocalDate date;
        DayOfCalendar holiday = null;
        try {
            int month = Integer.parseInt(param[0]);
            int day = Integer.parseInt(param[1]);
            int year = inputYear; //
            String description = param[2];
            date = LocalDate.of(year, month, day);
            holiday = new DayOfCalendar(date, description);
        } catch (Exception e) {
            throw new ParserException("Incorrect param", e);
        }

        return holiday;
    }
}
