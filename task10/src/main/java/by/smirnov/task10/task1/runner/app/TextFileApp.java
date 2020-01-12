package by.smirnov.task10.task1.runner.app;

import by.smirnov.task10.task1.controller.Controller;
import by.smirnov.task10.task1.view.View;
import by.smirnov.task10.task1.view.impl.ConsoleView;

import java.util.Scanner;

public class TextFileApp {
    private final Scanner in = new Scanner(System.in);
    private final View view;
    private final Controller controller;

    public TextFileApp() {
        System.out.println("Welcome to text file application");
        view = new ConsoleView(in);
        controller = new Controller();
    }

    public void startProgramm() {
        view.printMenu();
        while (true) {
            String request = view.sendRequest();
            String response = controller.executeTask(request);
            view.printResponse(response);
        }
    }
}
