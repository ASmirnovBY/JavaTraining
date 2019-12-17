package by.smirnov.decomposition.utils;

import java.util.Random;

public class RandomArrayGenerate {
    private static final int BOUND = 100;
    private Random random;

    public RandomArrayGenerate() {
        random = new Random();
    }

    public int[] getArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(BOUND);
        }

        return array;
    }
}
