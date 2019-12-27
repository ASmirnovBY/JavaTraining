package by.smirnov.oop.apphospital.view.command.impl;

import by.smirnov.oop.apphospital.view.command.RequestCommand;

import java.util.Scanner;

public class FindPatientByCart implements RequestCommand {
    @Override
    public String buildRequest(String input, Scanner in) {
        String request = input + RequestCommand.requestDelimetr;
        System.out.println("Input cart number");
        String diagnosis = in.nextLine();
        return request + diagnosis + requestDelimetr;
    }
}
