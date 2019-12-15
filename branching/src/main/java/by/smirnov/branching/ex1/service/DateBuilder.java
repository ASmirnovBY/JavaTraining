package by.smirnov.branching.ex1.service;

import by.smirnov.branching.ex1.entity.Date;
import by.smirnov.branching.ex1.reader.readerimpl.ConsoleReader;
import by.smirnov.branching.ex1.reader.readerinterface.Reader;
import by.smirnov.branching.ex1.reader.validatorimpl.ConsoleDateValidator;
import by.smirnov.branching.ex1.reader.validatorinterface.Validator;

import java.util.List;

public class DateBuilder {
    private static DateBuilder dateBuilder = null;
    private Reader reader;
    private Validator consoleDateValidator;
    private Month[] months;

    private DateBuilder() {
        reader = new ConsoleReader();
        consoleDateValidator = new ConsoleDateValidator(reader);
    }

    public static DateBuilder getBuilder() {
        if (dateBuilder == null) {
            dateBuilder = new DateBuilder();
        }
        return dateBuilder;
    }
    public Date createDate() {
        List<Integer> listForDate = null;
        int day = 0;
        int month = 0;
        int year = 0;

        try {
            listForDate = consoleDateValidator.getListValidValue();
            day = listForDate.get(0);
            month = listForDate.get(1);
            year = listForDate.get(2);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return new Date(day, month, year);
    }

}
