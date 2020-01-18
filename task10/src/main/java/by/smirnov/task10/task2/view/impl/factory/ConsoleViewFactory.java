package by.smirnov.task10.task2.view.impl.factory;

import by.smirnov.task10.task2.view.impl.*;

import java.util.Scanner;

public class ConsoleViewFactory {

    public static ConsoleView getView(String command, Scanner in) {
        ViewType type;
        try {
            type = ViewType.valueOf(command.toUpperCase());
        } catch (IllegalArgumentException e) {
            type = ViewType.BAD_REQUEST;
        }

        switch(type) {
            case BUILD:
                return new CalendarView(in);
            case BUILD_ALL:
                return new CalendarWithHolidayView(in);
            case BUILD_WORK:
                return new WorkDayView(in);
            case BUILD_WEEKEND:
                return new WeekendDayView(in);
            case EXIT:
                return new ExitView(in);
        }
        return new BadRequestView(in);
    }
}
