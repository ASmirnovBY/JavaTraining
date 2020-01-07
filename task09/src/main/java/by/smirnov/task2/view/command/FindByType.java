package by.smirnov.task2.view.command;

import java.util.Scanner;

public class FindByType implements RequestCommand {

    @Override
    public String buildRequest(String input, Scanner in) {
        String request = input + RequestCommand.requestDelimetr;
        System.out.println("Input tour type , example cruise, therapy, shopping, excursion");
        String type = in.nextLine();
        return request + type + requestDelimetr;
    }
}
