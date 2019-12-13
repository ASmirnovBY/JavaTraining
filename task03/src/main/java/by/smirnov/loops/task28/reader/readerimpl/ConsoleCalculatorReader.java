package by.smirnov.loops.task28.reader.readerimpl;

import by.smirnov.loops.task28.reader.readerinterface.Reader;
import by.smirnov.loops.task28.utils.validatorimpl.CalculatorConsoleValidator;
import by.smirnov.loops.task28.utils.validatorinterface.Validator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleCalculatorReader implements Reader {

    private static final String[] ARRAY_INPUT_TEXT = {
            "Input first operand :",
            "Input second operand :",
            "Input operation :",
            "Incorrect input, Try again",
            "Operation + - / *"
    };

    private Scanner in;
    private Validator validator;

    public ConsoleCalculatorReader(Scanner in) {
        this.in = in;
        validator = new CalculatorConsoleValidator();
    }

    @Override
    public List<String> read() {
        List<String> validString = new ArrayList<>();
        String operand1 = nextStringIsNumeric(0);
        String operand2 = nextStringIsNumeric(1);
        String operation = correctOperationString(2);
        validString.add(operand1);
        validString.add(operand2);
        validString.add(operation);
        return validString;
    }

    private String correctOperationString(int indexArrayText) {
        String operationString = "";
        boolean isCorrect = false;
        do {
            printInputText(indexArrayText);
            operationString = in.next();
            isCorrect = validator.isValidChar(operationString);
            if (!isCorrect) {
                printInputText(4);
            }
        } while (!isCorrect);

        return operationString;
    }

    private String nextStringIsNumeric(int indexArrayText) {
        String nextString = "";
        boolean isCorrect = false;
        do {
            printInputText(indexArrayText);
            nextString = in.next();
            isCorrect = validator.isValidNumeric(nextString);
            if (!isCorrect) {
                printInputText(3);
            }
        } while (!isCorrect);

        return nextString;
    }

    private void printInputText(int index) {
        System.out.println(ARRAY_INPUT_TEXT[index]);
    }

}
