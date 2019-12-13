package by.smirnov.loops.task28.utils.validatorimpl;

import by.smirnov.loops.task28.utils.validatorinterface.Validator;

public class CalculatorConsoleValidator implements Validator {

    @Override
    public boolean isValidNumeric(String someString) {
        exitChar(someString);
        return someString.matches("-?\\d+(\\.\\d+)?");
    }

    @Override
    public boolean isValidChar(String someString) {
        exitChar(someString);
        return (someString.length() == 1) && ((someString.charAt(0) == '+') ||
                (someString.charAt(0) == '-') || (someString.charAt(0) == '*')
                || (someString.charAt(0) == '/'));
    }

    private void exitChar(String someString) {
        if (someString.equalsIgnoreCase("O")) {
            System.exit(0);
        }
    }
}
