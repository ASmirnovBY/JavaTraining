package by.smirnov.task2.service;

import by.smirnov.task2.entity.tour.Tour;
import by.smirnov.task2.service.exception.LogicServiceException;

import java.util.List;

public interface TourService {
    List<Tour> findAllTour() throws LogicServiceException;
    Tour findById(int id) throws LogicServiceException;
    List<Tour> filterByType(String type) throws LogicServiceException;
    List<Tour> filterByCostInDay() throws LogicServiceException;
}
