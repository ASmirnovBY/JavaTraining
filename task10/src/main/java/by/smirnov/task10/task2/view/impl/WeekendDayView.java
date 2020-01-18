package by.smirnov.task10.task2.view.impl;

import by.smirnov.task10.task2.entity.Calendar;
import by.smirnov.task10.task2.utils.request.Request;
import by.smirnov.task10.task2.utils.request.Response;
import by.smirnov.task10.task2.utils.request.ResponseMessage;
import by.smirnov.task10.task2.view.impl.factory.ViewType;

import java.util.Scanner;

public class WeekendDayView extends ConsoleView {


   public WeekendDayView(Scanner in) {
        super(in);
    }

    @Override
    public Request buildRequest() {
        System.out.println("Input year");
        Request request = new Request();
        request.setCommand(ViewType.BUILD_WEEKEND.toString());
        String year = in.next();
        request.addParam("year", year);
        return request;
    }

    @Override
    public void printResponse(Response response) {
        if (response.getStatus()
                .equalsIgnoreCase(ResponseMessage.OK.toString())) {
            Calendar calendar = (Calendar) response.getObj();
            StringBuilder sb = new StringBuilder("Calendar of ")
                    .append(calendar.getYear()).append("\n");
            calendar.getWeekendDays().forEach(dayOfCalendar -> {
                sb.append(dayOfCalendar.toString()).append("\n");
            });
            System.out.println(sb);
        } else {
            System.out.println(response.getStatus());
        }
    }
}
