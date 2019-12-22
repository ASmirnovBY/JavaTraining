package by.smirnov.sorting.service.sortingimpl;

public class BinaryInsertSorting extends InsertSorting {
    @Override
    public int[] doSort(int[] array) {
        int element; // первый элемент не отсортированного массива
        int indexUnSorted;
        int insertLocation;
        int leftLine = 0;
        for (int i = 1; i < array.length; i++) {
            element = array[i];
            insertLocation = binarySearch(array, 0, i - 1, element);
            for (int j = i; j > insertLocation; j--) {
                swap(array, j, j - 1);
            }
        }
        return array;
    }

    public int binarySearch(int[] array, int left, int right, int value) {
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (value > array[mid])
                left = mid + 1;
            else if (value < array[mid])
                right = mid - 1;
            else
                return mid;
        }
        return left;
    }

}
