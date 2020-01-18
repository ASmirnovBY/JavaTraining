package by.smirnov.task10.task2.controller.command.impl;

import by.smirnov.task10.task2.controller.command.ControllerCommand;
import by.smirnov.task10.task2.entity.Calendar;
import by.smirnov.task10.task2.service.CalendarService;
import by.smirnov.task10.task2.service.exception.ServiceException;
import by.smirnov.task10.task2.service.factory.ServiceFactory;
import by.smirnov.task10.task2.utils.request.Request;
import by.smirnov.task10.task2.utils.request.Response;
import by.smirnov.task10.task2.utils.request.ResponseMessage;

public class WeekendDayCalendar implements ControllerCommand {

    @Override
    public Response execute(Request request) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        CalendarService calendarService = serviceFactory.getCalendarService();
        String strYear = request.getParam("year");
        Calendar calendar = null;
        try {
            int year = Integer.parseInt(strYear);
            calendar = calendarService.buildWeekendDaysCalendar(year);
        } catch (ServiceException |
                NumberFormatException e) {
            return new Response(ResponseMessage.INCORRECT_INPUT_YEAR.getMessage());
        }
        return new Response(ResponseMessage.OK.getMessage(), calendar);
    }
}
