package by.smirnov.oop.apphospital.view.command.impl;

import by.smirnov.oop.apphospital.view.command.RequestCommand;
import by.smirnov.oop.apphospital.view.command.RequestType;

import java.util.Scanner;

public class WrongRequest implements RequestCommand {

    @Override
    public String buildRequest(String input, Scanner in) {
        return RequestType.WRONG_REQUEST.toString() + RequestCommand.requestDelimetr;
    }
}
