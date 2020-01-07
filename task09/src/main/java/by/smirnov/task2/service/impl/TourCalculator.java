package by.smirnov.task2.service.impl;

import by.smirnov.task2.dao.FoodDAO;
import by.smirnov.task2.dao.TourDAO;
import by.smirnov.task2.dao.TransportDAO;
import by.smirnov.task2.dao.exception.DAOException;
import by.smirnov.task2.dao.fabric.StaticDAOFactory;
import by.smirnov.task2.entity.tour.Tour;
import by.smirnov.task2.service.exception.LogicServiceException;

public class TourCalculator {

    public double calculateCoast(int tourId, int transportId,
                                 int foodId, int days) throws LogicServiceException {
        if (days > 100 || days < 0) {
            throw new LogicServiceException("Incorrect day");
        }
        StaticDAOFactory daoFactory = StaticDAOFactory.getINSTANCE();

        TourDAO tourDAO = daoFactory.getTourDAO();
        TransportDAO transportDAO = daoFactory.getTransportDAO();
        FoodDAO foodDAO = daoFactory.getFoodDAO();
        double rez = 0;
        try {
            double costTourDay = (tourDAO.findById(tourId).getDayCost() * days);
            double costTransfer = (transportDAO.findById(transportId).getCostOnKm())
                    * (tourDAO.findById(tourId).getCity().getToCityKm());
            double costFood = (foodDAO.findById(foodId).getCost() * days);
            rez += costTourDay + costTransfer + costFood;
        } catch (IndexOutOfBoundsException
                | NumberFormatException
                | DAOException e) {
            throw new LogicServiceException("Error", e);
        }
        return rez;
    }
}
