package by.smirnov.task2.view.command;

import java.util.Scanner;

public class LoweCost implements RequestCommand{

    @Override
    public String buildRequest(String input, Scanner in) {
        return input + RequestCommand.requestDelimetr;
    }
}
