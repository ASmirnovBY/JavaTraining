package by.smirnov.task2.dao;

import by.smirnov.task2.dao.exception.DAOException;
import by.smirnov.task2.entity.tour.City;

import java.util.List;

public interface CityDAO {
    List<City> findAll() throws DAOException;
    City findById(int id) throws DAOException;
}
