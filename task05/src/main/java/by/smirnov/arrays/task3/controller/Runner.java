package by.smirnov.arrays.task3.controller;

import by.smirnov.arrays.utils.builder.ArrayBuilder;
import by.smirnov.arrays.services.ArrayOperation;


public class Runner {
    public static void main(String[] args) {
        int[] array = ArrayBuilder.arrayBuild(10, 10);
        ArrayOperation operation = new ArrayOperation();
        operation.printArray("Array", array);
        System.out.println(operation.signFirstElement(array));

    }

}
