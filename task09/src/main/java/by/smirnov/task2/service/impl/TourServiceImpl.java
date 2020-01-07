package by.smirnov.task2.service.impl;

import by.smirnov.task2.dao.TourDAO;
import by.smirnov.task2.dao.exception.DAOException;
import by.smirnov.task2.dao.fabric.StaticDAOFactory;
import by.smirnov.task2.entity.tour.Tour;
import by.smirnov.task2.service.TourService;
import by.smirnov.task2.service.exception.LogicServiceException;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TourServiceImpl implements TourService {
    private static final String PACKAGE_NAME = "class by.smirnov.task2.entity.tour.";

    @Override
    public List<Tour> findAllTour() throws LogicServiceException {
        StaticDAOFactory daoFactory = daoFactory = StaticDAOFactory.getINSTANCE();;
        TourDAO tourDAO = daoFactory.getTourDAO();
        List<Tour> tours = null;
        try {
            tours = tourDAO.findAll();

        } catch (DAOException e) {
            throw new LogicServiceException(e);
        }
        return tours;
    }

    @Override
    public Tour findById(int id) throws LogicServiceException {
        StaticDAOFactory daoFactory = daoFactory = StaticDAOFactory.getINSTANCE();;
        TourDAO tourDAO = daoFactory.getTourDAO();
        Tour findTour = null;
        try {
            findTour = tourDAO.findById(id);
        } catch (DAOException e) {
            throw new LogicServiceException(e);
        }
        return null;
    }

    @Override
    public List<Tour> filterByType(String type) throws LogicServiceException {
        StaticDAOFactory daoFactory = daoFactory = StaticDAOFactory.getINSTANCE();;
        TourDAO tourDAO = daoFactory.getTourDAO();
        List<Tour> filterByType = null;
        try {
            filterByType = tourDAO.findAll();
            filterByType = filterByType.stream()
                    .filter(tour ->
                        tour.getClass().toString().equalsIgnoreCase(PACKAGE_NAME + type)
                    ).collect(Collectors.toList());
        } catch (DAOException e) {
            throw new LogicServiceException(e);
        }
        return filterByType;
    }

    @Override
    public List<Tour> filterByCostInDay() throws LogicServiceException {
        StaticDAOFactory daoFactory = daoFactory = StaticDAOFactory.getINSTANCE();;
        TourDAO tourDAO = daoFactory.getTourDAO();
        List<Tour> filterByCost = null;
        try {
            filterByCost = tourDAO.findAll();
            filterByCost = filterByCost.stream()
                    .sorted(Comparator.comparingDouble(tour -> tour.getDayCost()))
                    .collect(Collectors.toList());
        } catch (DAOException e) {
            throw new LogicServiceException(e);
        }
        return filterByCost;
    }
    //Не забыть доделать
    public double calculate(Tour tour) {
        return 0;
    }
}
