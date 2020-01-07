package by.smirnov.task2.controller.command.impl;

import by.smirnov.task2.controller.command.Command;
import by.smirnov.task2.entity.tour.Tour;
import by.smirnov.task2.service.TourService;
import by.smirnov.task2.service.exception.LogicServiceException;
import by.smirnov.task2.service.impl.TourCalculator;
import by.smirnov.task2.service.impl.TourServiceImpl;

public class CostTour implements Command {
    @Override
    public String execute(String request) {
        String requestTourParam = request.substring((request.indexOf(Command.paramDelimetr) + 1)
                , request.lastIndexOf(Command.paramDelimetr));
        String[] params = requestTourParam.split(",");
        TourCalculator calculator = new TourCalculator();
        String response = "";
        double rez = 0;
        try {
            int idTour = Integer.parseInt(params[0]);
            int tranSportId = Integer.parseInt(params[1]);
            int foodId = Integer.parseInt(params[2]);
            int days = Integer.parseInt(params[3]);
            rez = calculator.calculateCoast(idTour, tranSportId
                    , foodId, days);
            response = "Cost you tour " + rez + " $";
        } catch (LogicServiceException | NumberFormatException e) {
            response = "Wrong param request";
        }
        return response;
    }
}
