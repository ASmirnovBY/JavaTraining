package by.smirnov.sorting.utils.builder;

import java.util.Random;

public class ArrayBuilder {

    public static int[] arrayBuild(int size, int bound) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            if(generateSign()) {
                array[i] = random.nextInt(bound);
            } else {
                array[i] = (-1) * random.nextInt(bound);
            }

        }
        return array;
    }

    private static boolean generateSign() {
        Random random = new Random();
        return random.nextBoolean();
    }

    public static void printArray(String label, int[] array) {
        System.out.println(label + " ");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
