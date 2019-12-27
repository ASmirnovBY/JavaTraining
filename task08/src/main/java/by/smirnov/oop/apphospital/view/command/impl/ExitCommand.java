package by.smirnov.oop.apphospital.view.command.impl;

import by.smirnov.oop.apphospital.view.command.RequestCommand;

import java.util.Scanner;

public class ExitCommand implements RequestCommand {

    @Override
    public String buildRequest(String input, Scanner in) {
        in.close();
        System.exit(0);
        return "";
    }
}
