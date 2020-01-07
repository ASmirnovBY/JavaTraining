package by.smirnov.task2.dao.impl;

import by.smirnov.task2.dao.TourDAO;
import by.smirnov.task2.dao.exception.DAOException;
import by.smirnov.task2.db.TourTable;
import by.smirnov.task2.entity.tour.Tour;

import java.util.List;

public class StaticTourDAO implements TourDAO {

    @Override
    public List<Tour> findAll() throws DAOException {
        TourTable tourTable = null;
        try {
            tourTable = TourTable.getINSTANCE();
        }catch (NullPointerException e) {
            throw new DAOException("No food in data base", e);
        }
        return tourTable.getTours();
    }

    @Override
    public Tour findById(int id) throws DAOException {
        TourTable tourTable = null;
        Tour tour = null;
        try {
            tourTable = TourTable.getINSTANCE();
            tour = tourTable.getTours().get(id - 1);
        } catch (NullPointerException e) {
            throw new DAOException("No Tour in data base", e);
        }  catch (IndexOutOfBoundsException e) {
            throw new DAOException("Incorrect id", e);
        }
        return tour;
    }
}
