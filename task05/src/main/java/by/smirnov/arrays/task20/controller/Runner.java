package by.smirnov.arrays.task20.controller;

import by.smirnov.arrays.services.ArrayOperation;

public class Runner {
    public static void main(String[] args) {
        ArrayOperation operation = new ArrayOperation();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,}; //{1, 3 ,5, 7, 9, 11 0 0 0 0 0 0}
        operation.squeezeArray(array);
        operation.printArray(array);
    }

}
