package by.smirnov.task2.dao.fabric;

import by.smirnov.task2.dao.CityDAO;
import by.smirnov.task2.dao.FoodDAO;
import by.smirnov.task2.dao.TourDAO;
import by.smirnov.task2.dao.TransportDAO;
import by.smirnov.task2.dao.impl.StaticCityDAO;
import by.smirnov.task2.dao.impl.StaticFoodDAO;
import by.smirnov.task2.dao.impl.StaticTourDAO;
import by.smirnov.task2.dao.impl.StaticTransportDAO;

public final class StaticDAOFactory {
    private static final StaticDAOFactory INSTANCE = new StaticDAOFactory();

    private final CityDAO cityDAO = new StaticCityDAO();
    private final FoodDAO foodDAO = new StaticFoodDAO();
    private final TourDAO tourDAO = new StaticTourDAO();
    private final TransportDAO transportDAO = new StaticTransportDAO();

    private StaticDAOFactory() {

    }

    public static StaticDAOFactory getINSTANCE() {
        return INSTANCE;
    }

    public CityDAO getCityDAO() {
        return cityDAO;
    }

    public FoodDAO getFoodDAO() {
        return foodDAO;
    }

    public TourDAO getTourDAO() {
        return tourDAO;
    }

    public TransportDAO getTransportDAO() {
        return transportDAO;
    }
}
