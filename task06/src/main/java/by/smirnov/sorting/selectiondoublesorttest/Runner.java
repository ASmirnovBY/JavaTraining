package by.smirnov.sorting.selectiondoublesorttest;

import by.smirnov.sorting.service.sortingimpl.BubbleSort;
import by.smirnov.sorting.service.sortingimpl.SelectionDoubleSort;
import by.smirnov.sorting.service.sortinginterface.Sorting;
import by.smirnov.sorting.utils.builder.ArrayBuilder;

public class Runner {
    public static void main(String[] args) {
        int[] array = ArrayBuilder.arrayBuild(10, 100);
        //int[] array = {-59, 36, 81, 51};
        ArrayBuilder.printArray("Array", array);
        Sorting methodSorting = new SelectionDoubleSort();
        methodSorting.doSort(array);
        ArrayBuilder.printArray("\nSorted array", array);
    }
}
