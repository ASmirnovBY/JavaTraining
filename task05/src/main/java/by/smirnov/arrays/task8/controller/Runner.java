package by.smirnov.arrays.task8.controller;

import by.smirnov.arrays.services.ArrayOperation;
import by.smirnov.arrays.utils.builder.ArrayBuilder;

public class Runner {
    public static void main(String[] args) {
        int[] array = ArrayBuilder.arrayBuild(10, 20);
        ArrayOperation operation = new ArrayOperation();
        operation.printArray(array);
        System.out.println("positive " + operation.howPositiveNumber(array));
        System.out.println("negative " + operation.howNegativeNumber(array));
        System.out.println("Zero " + operation.howZeroNumber(array));
    }
}
