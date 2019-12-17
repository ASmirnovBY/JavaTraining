package by.smirnov.decomposition.task13.service;

public class ArrayBuilder {
    public static final int DELIVER = 10;

    public int[] generateIntNumberToArray(int number) {
        int[] array = new int[digitInNumber1(number)];
        for(int i = array.length - 1; i >= 0; i--) {
            array[i] = number % DELIVER;
            number /= DELIVER;
        }
        return array;
    }

    private  int digitInNumber1(int number) {
        int count = 0;
        while(number > 0) {
            number /= DELIVER;
            count++;
        }
        return count;
    }

}
