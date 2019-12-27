package by.smirnov.oop.apphospital.view.command;

import java.util.Scanner;

public interface RequestCommand {
    char requestDelimetr = '&';
    String buildRequest(String input, Scanner in);
}
