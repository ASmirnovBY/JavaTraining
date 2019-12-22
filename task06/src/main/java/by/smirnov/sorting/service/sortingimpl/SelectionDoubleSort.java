package by.smirnov.sorting.service.sortingimpl;

public class SelectionDoubleSort extends SelectionSort {

    @Override
    public int[] doSort(int[] array) {
        int size = array.length; //ƒлинна массива
        int min = 0; //граница минимального элемента массива
        int max = size - 1;//граница максимального элемента
        int indexMin;//индекс минимального элемента в массиве
        int indexMax;//индекс максимального элемента в масиве
        for (int i = min; i < max; i++) {
            indexMin = indexMinElement(array, i);
            if (i != indexMin) {
                swap(array, indexMin, min);
            }
            min++;
            indexMax = indexMaxElement(array, min, max);
            if (i != indexMax) {
                swap(array, indexMax, max);
            }
            max--;
        }
        return array;
    }

    protected int indexMaxElement(int[] array, int indexMinElement, int max) {
        int maxElement = array[indexMinElement];
        int indexMaxElement = indexMinElement;
        for (int i = indexMinElement; i <= max; i++) {
            if (maxElement < array[i]) {
                maxElement = array[i];
                indexMaxElement = i;
            }
        }
        return indexMaxElement;
    }
}

