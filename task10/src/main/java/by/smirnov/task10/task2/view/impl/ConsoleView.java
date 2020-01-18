package by.smirnov.task10.task2.view.impl;
import by.smirnov.task10.task2.view.View;

import java.util.Scanner;

public abstract class ConsoleView implements View {
    protected Scanner in;

    protected ConsoleView(Scanner in) {
        this.in = in;
    }
}
