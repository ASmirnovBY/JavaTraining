package by.smirnov.task10.task2.view.impl;

import by.smirnov.task10.task2.utils.request.Request;
import by.smirnov.task10.task2.utils.request.Response;
import by.smirnov.task10.task2.view.impl.factory.ViewType;

import java.util.Scanner;

public class ExitView extends ConsoleView{

    public ExitView(Scanner in) {
        super(in);
    }

    @Override
    public Request buildRequest() {
       in.close();
        System.out.println("Good bay");
       System.exit(0);
       Request request = new Request();
       request.setCommand(ViewType.EXIT.toString());
       return request;
    }

    @Override
    public void printResponse(Response response) {
        System.out.println(response.getStatus());
    }
}
