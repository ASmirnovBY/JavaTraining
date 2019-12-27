package by.smirnov.oop.apphospital.view.command.impl;

import by.smirnov.oop.apphospital.view.command.RequestCommand;

import java.util.Scanner;

public class FindPatientByDiagnosis implements RequestCommand {
    @Override
    public String buildRequest(String input, Scanner in) {
        String request = input + RequestCommand.requestDelimetr;
        System.out.println("Input diagnosis");
        String diagnosis = in.nextLine();
        return request + diagnosis + requestDelimetr;
    }
}
