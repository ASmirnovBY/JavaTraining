package by.smirnov.task10.task2.runner.app;

import by.smirnov.task10.task2.controller.Controller;
import by.smirnov.task10.task2.utils.request.Request;
import by.smirnov.task10.task2.utils.request.Response;
import by.smirnov.task10.task2.view.View;
import by.smirnov.task10.task2.view.impl.factory.ConsoleViewFactory;
import by.smirnov.task10.task2.view.impl.factory.ViewType;

import java.util.Scanner;

public class CalendarApp {
    private Scanner in;
    private View view;
    private Controller controller;

    public CalendarApp() {
       in = new Scanner(System.in);
    }

    void start() {
        String requestStr;
        printMenu();
        while (true) {
            System.out.println("input command");
            requestStr = in.next();
            view = ConsoleViewFactory.getView(requestStr, in);
            Request request = view.buildRequest();
            controller = new Controller();
            Response calendarResponse = controller.executeTask(request);
            view.printResponse(calendarResponse);
        }
    }

    private void printMenu() {
        StringBuilder builder = new StringBuilder("Hello");
        builder.append("\n")
                .append("If you want show calendar with work and weekend day input ")
                .append(ViewType.BUILD.toString().toLowerCase());
        builder.append("\n")
                .append("If you want show calendar with work day input ")
                .append(ViewType.BUILD_WORK.toString().toLowerCase());
        builder.append("\n")
                .append("If you want show calendar with weekend day input ")
                .append(ViewType.BUILD_WEEKEND.toString().toLowerCase());
        builder.append("\n")
                .append("If you want show calendar days with Holiday day input ")
                .append(ViewType.BUILD_ALL.toString().toLowerCase());

        System.out.println(builder);

    }
}
