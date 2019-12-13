package by.smirnov.loops.task38.utils.validatoimpl;

import by.smirnov.loops.task38.utils.validatorinterface.Validator;

public class DigitValidator implements Validator {
    private static final int MIN_NUMBER_SIZE = 3;

    @Override
    public boolean isValid(String someString) {
        return (someString.length() >= MIN_NUMBER_SIZE)
                && (someString.matches("\\d+?"));
    }
}
