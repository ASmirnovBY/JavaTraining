package by.smirnov.task10.task2.dao.factory;

import by.smirnov.task10.task2.dao.HolidaysDAO;
import by.smirnov.task10.task2.dao.impl.FileHolidayDAO;

public class DAOFactory {
    private static final DAOFactory INSTANCE = new DAOFactory();

    private final HolidaysDAO holidaysDAO = new FileHolidayDAO();

    public static DAOFactory getInstance() {
        return INSTANCE;
    }

    public HolidaysDAO getHolidaysDAO() {
        return holidaysDAO;
    }





}
