package by.smirnov.task2.controller.command.impl;

import by.smirnov.task2.controller.command.Command;
import by.smirnov.task2.entity.tour.Tour;
import by.smirnov.task2.service.TourService;
import by.smirnov.task2.service.exception.LogicServiceException;
import by.smirnov.task2.service.impl.TourServiceImpl;

import java.util.List;

public class AllTours implements Command {
    @Override
    public String execute(String request)  {
        StringBuilder response = new StringBuilder();
        TourService service = new TourServiceImpl();
        List<Tour> tours;
        try {
          tours = service.findAllTour();
          for (Tour tour : tours) {
              response.append(tour.toPrint()).append("\n");
          }
        } catch (LogicServiceException e) {
            response.append("Error");
        }
        return response.toString();
    }
}