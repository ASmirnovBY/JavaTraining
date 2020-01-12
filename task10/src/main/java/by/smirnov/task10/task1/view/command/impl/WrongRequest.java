package by.smirnov.task10.task1.view.command.impl;

import by.smirnov.task10.task1.view.command.RequestCommand;

import java.util.Scanner;

public class WrongRequest implements RequestCommand {

    @Override
    public String buildRequest(String input, Scanner in) {
        return input;
    }
}
