package by.smirnov.loops.task38.service;

import by.smirnov.loops.task38.reader.readerinterface.Reader;

public final class NumberAnalyzer {
    private Reader reader;

    public NumberAnalyzer(Reader reader) {
        this.reader = reader;
    }

    public boolean digitHasArithmeticProgression() {
        String strNumber = reader.read();
        return findArithmeticProgression(strNumber);
    }

    private boolean findArithmeticProgression(String strNumber) {
        int countDigits = strNumber.length();
        int firstDigit = Integer.parseInt(String.valueOf(strNumber.charAt(0)));
        int lastDigit = Integer.parseInt(String.valueOf(strNumber.charAt(countDigits - 1)));
        int sumTeoretic = (firstDigit + lastDigit) * countDigits / 2;
        int sumPractic = 0;
        for(int i = 0; i < countDigits; i++) {
            sumPractic += Integer.parseInt(String.valueOf(strNumber.charAt(i)));
        }

        return (sumPractic == sumTeoretic);
    }
}
