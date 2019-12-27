package by.smirnov.oop.task1.controller;

import by.smirnov.oop.task1.entity.Test1;
import by.smirnov.oop.task1.service.Updater;
import by.smirnov.oop.task1.ui.ConsoleUi;

public class Runner {
    public static void main(String[] args) {
        Test1 test = new Test1(25, 5);
        ConsoleUi ui = new ConsoleUi();
        Updater updater = new Updater();
        int max = updater.max(test);
        int sum = updater.sum(test);
        ui.show("Max", max);
        ui.show("Sum", sum);
    }
}
