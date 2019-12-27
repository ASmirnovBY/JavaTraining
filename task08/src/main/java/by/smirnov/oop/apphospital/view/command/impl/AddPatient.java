package by.smirnov.oop.apphospital.view.command.impl;

import by.smirnov.oop.apphospital.view.command.RequestCommand;
import by.smirnov.oop.apphospital.view.utils.PatientParametr;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddPatient implements RequestCommand {

    @Override
    public String buildRequest(String input, Scanner in) {
        StringBuilder request = new StringBuilder(input).append(RequestCommand.requestDelimetr);
        return validationInputPatient(in, request);
    }

    private String validationInputPatient(Scanner in, StringBuilder request) {
        PatientParametr[] enumParam = PatientParametr.values();
        StringBuilder strParametrs;
        Pattern pattern;
        Matcher matcher;
        for (PatientParametr param : enumParam) {
            System.out.println(param.getInputMessage());
            while (true) {
                strParametrs = new StringBuilder(in.nextLine());
                pattern = Pattern.compile(param.getReg());
                matcher = pattern.matcher(strParametrs);

                if(matcher.matches()) {
                    request.append(strParametrs).append(",");
                    break;
                } else {
                    System.out.println(param.getIncorrectMessage());
                }
                matcher = null;
                pattern = null;
                strParametrs = null;
            }
        }
        return request.append(RequestCommand.requestDelimetr).toString();
    }

}
