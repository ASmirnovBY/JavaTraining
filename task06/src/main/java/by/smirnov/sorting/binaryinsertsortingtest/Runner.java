package by.smirnov.sorting.binaryinsertsortingtest;

import by.smirnov.sorting.service.sortingimpl.BinaryInsertSorting;
import by.smirnov.sorting.service.sortingimpl.BubbleSort;
import by.smirnov.sorting.service.sortinginterface.Sorting;
import by.smirnov.sorting.utils.builder.ArrayBuilder;

public class Runner {
    public static void main(String[] args) {
        int[] array = ArrayBuilder.arrayBuild(10, 100);
        //int[] array = {5, 4, 0, 1, 3};
        ArrayBuilder.printArray("Array", array);
        Sorting methodSorting = new BinaryInsertSorting();
        methodSorting.doSort(array);
        ArrayBuilder.printArray("\nSorted array", array);
    }
}
