package by.smirnov.task10.task1.view.impl;

import by.smirnov.task10.task1.view.View;
import by.smirnov.task10.task1.view.command.RequestCommand;

import java.util.Scanner;

public class ConsoleView implements View {
    private final RequestProvider provider = new RequestProvider();

    private Scanner in;

    public ConsoleView(Scanner in) {
        this.in = in;
    }

    @Override
    public String sendRequest() {
        String request = in.nextLine();
        RequestCommand requestCommand = provider.getRequestCommand(request);
        return requestCommand.buildRequest(request, in);
    }

    @Override
    public void printResponse(String response) {
        System.out.println(response);
    }

    @Override
    public void printMenu() {
        System.out.println("If you want create new file input --- create");
        System.out.println("If you want delete file input --- delete");
        System.out.println("If you want rename file input --- rename");
        System.out.println("If you want read file input --- read");
        System.out.println("If you want add text in file input --- add");
        System.out.println("If you want exit input --- exit");
    }
}
