package task1.controller;

import java.util.Random;

public class Runner {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }

        for(int a : array) {
            System.out.print(a + " ");
        }
        System.out.println("");
        for(int a : swapArray(array)) {
            System.out.print(a + " ");
        }

    }

    private static int[] swapArray(int[] array) {
        int temp;
        for (int i = 0; i <= array.length / 2 - 1; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1] = temp;
        }
        return array;
    }
}
