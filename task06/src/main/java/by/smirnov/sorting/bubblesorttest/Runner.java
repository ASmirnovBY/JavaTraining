package by.smirnov.sorting.bubblesorttest;

import by.smirnov.sorting.service.sortingimpl.BubbleSort;
import by.smirnov.sorting.service.sortinginterface.Sorting;
import by.smirnov.sorting.utils.builder.ArrayBuilder;

public class Runner {
    public static void main(String[] args) {
        int[] array = ArrayBuilder.arrayBuild(10, 100);
        ArrayBuilder.printArray("Array", array);
        Sorting methodSorting = new BubbleSort();
        methodSorting.doSort(array);
        ArrayBuilder.printArray("\nSorted array", array);
    }
}
