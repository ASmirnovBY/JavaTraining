package by.smirnov.task2.controller.command.impl;

import by.smirnov.task2.controller.command.Command;
import by.smirnov.task2.entity.tour.Tour;
import by.smirnov.task2.service.TourService;
import by.smirnov.task2.service.exception.LogicServiceException;
import by.smirnov.task2.service.impl.TourServiceImpl;

import java.util.List;

public class TourType implements Command {

    @Override
    public String execute(String request) {
        String type = request.substring((request.indexOf(Command.paramDelimetr) + 1)
                , request.lastIndexOf(Command.paramDelimetr));
        StringBuilder response = new StringBuilder();
        TourService service = new TourServiceImpl();
        List<Tour> tours;
        try {
            tours = service.filterByType(type);
            for (Tour tour : tours) {
                response.append(tour.toPrint()).append("\n");
            }
            if (tours.isEmpty()) {
                response.append("No tour with this type");
            }
        } catch (LogicServiceException e) {
            response.append("Error");
        }
        return response.toString();
    }
}
