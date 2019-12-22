package by.smirnov.sorting.shakersorttest;

import by.smirnov.sorting.service.sortingimpl.BubbleSort;
import by.smirnov.sorting.service.sortingimpl.ShakerSort;
import by.smirnov.sorting.service.sortinginterface.Sorting;
import by.smirnov.sorting.utils.builder.ArrayBuilder;

public class Runner {
    public static void main(String[] args) {
        int[] array = ArrayBuilder.arrayBuild(10, 100);
        ArrayBuilder.printArray("Array", array);
        Sorting methodSorting = new ShakerSort();
        methodSorting.doSort(array);
        ArrayBuilder.printArray("\nSorted array", array);
    }
}
