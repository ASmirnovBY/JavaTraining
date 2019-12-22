package by.smirnov.arrays.task13.controller;

import by.smirnov.arrays.services.ArrayOperation;
import by.smirnov.arrays.utils.builder.ArrayBuilder;

public class Runner {
    public static void main(String[] args) {
        int[] array = ArrayBuilder.arrayBuild(10, 25);
        ArrayOperation operation = new ArrayOperation();
        operation.printArray(array);
        System.out.println(operation.howNumberAliquotInRange(array, 2,
                2, 25));
    }
}
