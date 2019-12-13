package by.smirnov.loops.task38.reader.readerimpl;

import by.smirnov.loops.task38.reader.readerinterface.Reader;
import by.smirnov.loops.task38.utils.validatoimpl.DigitValidator;
import by.smirnov.loops.task38.utils.validatorinterface.Validator;

import java.util.Scanner;

public class ConsoleNumberReader implements Reader {
    private static final String[] ARRAY_MESSAGES = {"Input number",
            "Number must be > 3 digit for example: 456, try again"};

    private Scanner in;
    private Validator validator;

    public ConsoleNumberReader() {
        this.in = new Scanner(System.in);
        validator = new DigitValidator();
    }


    @Override
    public String read() {
        printMessage(0);
        return getValidateNumber();
    }

    private String getValidateNumber() {
        boolean isCorrect = false;
        String strNumber;
        do {
            strNumber = in.next();
            isCorrect = validator.isValid(strNumber);
            if (isCorrect) {
               return strNumber;
            } else {
                printMessage(1);
            }
        } while (!isCorrect);

        return strNumber;
    }

    private void printMessage(int index) {
        System.out.println(ARRAY_MESSAGES[index]);
    }
}
