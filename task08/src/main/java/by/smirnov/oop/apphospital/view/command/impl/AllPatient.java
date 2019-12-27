package by.smirnov.oop.apphospital.view.command.impl;

import by.smirnov.oop.apphospital.view.command.RequestCommand;

import java.util.Scanner;

public class AllPatient implements RequestCommand {

    @Override
    public String buildRequest(String input, Scanner in) {
        return input + RequestCommand.requestDelimetr;
    }
}
