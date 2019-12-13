package by.smirnov.loops.task28.service;

import by.smirnov.loops.task28.reader.readerinterface.Reader;
import java.util.List;

public final class Calculator {
    private Reader reader;

    public Calculator(Reader reader) {
        this.reader = reader;
    }

    public double doOperation() {
        double rez = 0;
        List<String> operands;
        operands = reader.read();
        double operand1 = Double.parseDouble(operands.get(0));
        double operand2 = Double.parseDouble(operands.get(1));
        String operation = operands.get(2);

        switch (operation) {
            case "+":
                rez = add(operand1, operand2);
                break;
            case "-":
                rez = deduct(operand1, operand2);
                break;
            case "/":
                if (operand2 != 0) {
                    rez = divide(operand1, operand2);
                } else {
                    System.out.println("/ zero");
                    System.exit(0);
                }
                break;
            case "*":
                rez = mux(operand1, operand2);
                break;
            default:
                throw new IllegalArgumentException("Calculator can + - / * your input " + operation);
        }

        return rez;
    }

    private double add(double operand1, double operand2) {
        return operand1 + operand2;
    }

    private double mux(double operand1, double operand2) {
        return operand1 * operand2;
    }

    private double divide(double operand1, double operand2) {
        return (operand2 != 0) ? (operand1 / operand2) : 0;
    }

    private double deduct(double operand1, double operand2) {
        return operand1 - operand2;
    }
}
