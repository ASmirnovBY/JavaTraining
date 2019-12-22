package by.smirnov.decomposition.task18.service;

public class NumericalCreater {

    public void printStrictlyIncreasingNum(int startDigit,
                                           String out, int numberSize) {
        if(numberSize == 0) {
            System.out.print(out + " ");
        }

        for(int i = startDigit; i <= 9; i++) {
            String strNumber = out + Integer.toString(i);
            printStrictlyIncreasingNum(i + 1, strNumber, numberSize - 1);
        }
    }
}
