package by.smirnov.sorting.service.sortinginterface;

public interface Sorting {
    int[] doSort(int[] array);

    default void swap(int[] array, int firstElement, int secondElement) {
        int temp = array[firstElement];
        array[firstElement] = array[secondElement];
        array[secondElement] = temp;
    }
}
