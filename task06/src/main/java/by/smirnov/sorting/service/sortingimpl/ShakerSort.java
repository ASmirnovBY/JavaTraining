package by.smirnov.sorting.service.sortingimpl;

public class ShakerSort extends BubbleSort {

    @Override
    public int[] doSort(int[] array) {
        int size = array.length; //Длинна массива
        boolean isSwaped = true; //Флаг на определение если true значит была сортировка и массив не отсортирован
        int min = 0; //позиция минимального элемента
        int max = size - 1;//позиция максимального элемента

        while (isSwaped) { // Выполняем сортировка пока флаг = true
            for (int i = min; i < max; i++) {//бежим от начала массива и и вставляем большой элемент в конец
                if (array[i] > array[i + 1]) {
                    swap(array, i, (i + 1));
                    isSwaped = true;
                }
            }

            if (!isSwaped) {//если не было перестановок то выходим из массива
                break;
            }

            isSwaped = false;//переназначем флаг на false
            max--;//уменьшаем позицию последнего элемента для скорости

            for (int j = max; j > min; j--) {//бежим от конца массива и и вставляем маленький элемент в начало
                if (array[j] < array[j - 1]) {
                    swap(array, j, (j - 1));
                    isSwaped = true;
                }
            }
            min++;
        }

        return array;
    }
}
