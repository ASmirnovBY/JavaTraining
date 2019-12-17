package by.smirnov.decomposition.task3.service;

public class ArithmeticHelper {

    public int nod(int val1, int val2) {
        int temp;
        while (val2 != 0) {
            temp = val2;
            val2 = val1 % val2;
            val1 = temp;
        }
        return val1;
    }

    public int nod(int val1, int val2, int val3, int val4) {
        int temp;
        int tmpVal1 = nod(val1, val2);
        int tmpVal2 = nod(val3, val4);
        while (tmpVal2 != 0) {
            temp = tmpVal2;
            tmpVal2 = tmpVal1 % tmpVal2;
            tmpVal1 = temp;
        }
        return tmpVal1;
    }
}
