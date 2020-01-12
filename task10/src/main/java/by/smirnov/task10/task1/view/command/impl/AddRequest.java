package by.smirnov.task10.task1.view.command.impl;

import by.smirnov.task10.task1.view.command.RequestCommand;

import java.util.Scanner;

public class AddRequest implements RequestCommand {

    @Override
    public String buildRequest(String input, Scanner in) {
        StringBuilder request = new StringBuilder(input);
        request.append(RequestCommand.requestDil);
        System.out.println("Input Directory example D:\\");
        String directory = in.nextLine();
        request.append(directory);
        request.append(RequestCommand.requestDil);
        System.out.println("Input file name");
        String name = in.nextLine();
        request.append(name);
        request.append(RequestCommand.requestDil);
        System.out.println("Input text");
        String text = in.nextLine();
        request.append(text);
        return request.toString();
    }
}
