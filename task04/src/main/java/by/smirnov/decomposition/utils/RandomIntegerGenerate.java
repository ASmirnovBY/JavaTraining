package by.smirnov.decomposition.utils;

import java.util.Random;

public class RandomIntegerGenerate {
    private static final int BOUND = 100000;
    private Random random;

    public RandomIntegerGenerate() {
        random = new Random();
    }

    public int getInt() {
        return random.nextInt(BOUND);
    }
}
