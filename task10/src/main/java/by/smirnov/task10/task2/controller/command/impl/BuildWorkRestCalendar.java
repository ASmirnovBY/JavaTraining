package by.smirnov.task10.task2.controller.command.impl;

import by.smirnov.task10.task2.controller.command.ControllerCommand;
import by.smirnov.task10.task2.entity.Calendar;
import by.smirnov.task10.task2.service.CalendarService;
import by.smirnov.task10.task2.service.exception.ServiceException;
import by.smirnov.task10.task2.service.factory.ServiceFactory;
import by.smirnov.task10.task2.utils.request.Request;
import by.smirnov.task10.task2.utils.request.Response;
import by.smirnov.task10.task2.utils.request.ResponseMessage;

public class BuildWorkRestCalendar implements ControllerCommand {
    @Override
    public Response execute(Request request) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        CalendarService calendarService = serviceFactory.getCalendarService();
        String strYear = request.getParam("year");
        String country = request.getParam("country");
        Calendar calendar = null;

        try {
            int year = Integer.parseInt(strYear);
            calendar = calendarService.addHolidayInCalendar(year,country);
            calendar.buildWorkAndRestDays();
        } catch (NumberFormatException e) {
            return new Response(ResponseMessage.INCORRECT_INPUT_YEAR.getMessage());
        } catch (ServiceException e) {
            return new Response(e.getMessage());
        }

        return new Response(ResponseMessage.OK.getMessage(), calendar);
    }
}
