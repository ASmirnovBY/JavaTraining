package by.smirnov.task2.dao.impl;

import by.smirnov.task2.dao.CityDAO;
import by.smirnov.task2.dao.exception.DAOException;
import by.smirnov.task2.db.CityTable;
import by.smirnov.task2.entity.tour.City;

import java.util.List;

public class StaticCityDAO implements CityDAO {

    @Override
    public List<City> findAll() throws DAOException {
        CityTable cityTable = null;
        try {
            cityTable = CityTable.getINSTANCE();
        } catch (NullPointerException e) {
            throw new DAOException("No city in data base", e);
        }
        return cityTable.getCities();
    }

    @Override
    public City findById(int id) throws DAOException {
        CityTable cityTable = null;
        City city = null;
        try {
            cityTable = CityTable.getINSTANCE();
            city = cityTable.getCityById(id);
        } catch (NullPointerException e) {
            throw new DAOException("No city in data base", e);
        } catch (IndexOutOfBoundsException e) {
            throw new DAOException("Incorrect id", e);
        }
        return city;
    }
}
