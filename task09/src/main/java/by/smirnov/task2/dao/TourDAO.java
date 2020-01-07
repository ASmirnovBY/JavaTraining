package by.smirnov.task2.dao;

import by.smirnov.task2.dao.exception.DAOException;
import by.smirnov.task2.entity.tour.Tour;
import java.util.List;

public interface TourDAO {
    List<Tour> findAll() throws DAOException;
    Tour findById(int id) throws DAOException;
}
