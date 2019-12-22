package by.smirnov.sorting.service.sortingimpl;

import by.smirnov.sorting.service.sortinginterface.Sorting;

public class InsertSorting implements Sorting {

    @Override
    public int[] doSort(int[] array) {
        int element; // первый элемент не отсортированного массива
        int indexUnSorted;
        for (int i = 1; i < array.length; i++) {//начинаем с 1 потаму что 0-это позиция якобы сортированного массива
            element = array[i];//следующие элементы неотсортированного массива
            indexUnSorted = i;// индекс неотсортированного массива
            while ((indexUnSorted > 0)
                    && (array[indexUnSorted - 1] > element)) { // пока элементы леевее больше то меняемся местами
                    swap(array, indexUnSorted, indexUnSorted - 1 );
                    indexUnSorted--;
            }
        }
        return array;
    }
}
