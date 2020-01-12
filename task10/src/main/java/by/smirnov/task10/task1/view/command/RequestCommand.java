package by.smirnov.task10.task1.view.command;

import java.util.Scanner;

public interface RequestCommand {
    String requestDil = "&";
    String buildRequest(String input, Scanner in);
}
