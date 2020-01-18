package by.smirnov.task10.task2.view.impl;

import by.smirnov.task10.task2.utils.request.Request;
import by.smirnov.task10.task2.utils.request.Response;
import by.smirnov.task10.task2.view.impl.factory.ViewType;

import java.util.Scanner;

public class BadRequestView extends ConsoleView{

    public BadRequestView(Scanner in) {
        super(in);
    }

    @Override
    public Request buildRequest() {
        Request request = new Request();
        request.setCommand(ViewType.BAD_REQUEST.toString());
        return request;
    }

    @Override
    public void printResponse(Response response) {
        System.out.println(response.getStatus());
    }
}
