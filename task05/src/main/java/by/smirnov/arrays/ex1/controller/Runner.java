package by.smirnov.arrays.ex1.controller;

public class Runner {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int[] array2 = {5, 5, 7, 8, 9, 10};
        printArray(array);
        printArray(reversArray(array));
        printArray(array2);
        printArray(reversArray(array2));

    }

    private static int[] reversArray(int[] array) {
        int size = array.length;
        for (int i = 0; i < (size / 2); i++) {
            int k = size - 1;
            swap(array, i, (k - i));
        }
        return array;
    }

    private static void swap(int[] array, int firstValue, int secondValue) {
        int temp = array[firstValue];
        array[firstValue] = array[secondValue];
        array[secondValue] = temp;
    }

    private static void printArray(int[] array) {
        System.out.println("Array ");
        for (int e : array) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
}
