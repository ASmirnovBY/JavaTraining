package by.smirnov.task2.view.command;

import java.util.Scanner;

public class Exit implements RequestCommand {
    @Override
    public String buildRequest(String input, Scanner in) {
        in.close();
        System.exit(0);
        return "";
    }
}
