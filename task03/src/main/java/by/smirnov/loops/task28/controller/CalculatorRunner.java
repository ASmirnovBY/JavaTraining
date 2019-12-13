package by.smirnov.loops.task28.controller;

import by.smirnov.loops.task28.reader.readerimpl.ConsoleCalculatorReader;
import by.smirnov.loops.task28.reader.readerinterface.Reader;
import by.smirnov.loops.task28.service.Calculator;

import java.util.Scanner;

public final class CalculatorRunner {
    private Scanner in;
    private Reader reader;
    private Calculator calculator;

    public CalculatorRunner() {
        in = new Scanner(System.in);
        reader = new ConsoleCalculatorReader(in);
        calculator = new Calculator(reader);
    }

    public void startCalculator() {
        String nextString;
        double rez = 0;
        do {
            rez = calculator.doOperation();
            System.out.println("Rez = " + rez);
        } while (true);
    }
}
