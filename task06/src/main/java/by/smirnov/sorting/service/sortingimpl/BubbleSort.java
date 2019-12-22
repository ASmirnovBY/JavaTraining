package by.smirnov.sorting.service.sortingimpl;

import by.smirnov.sorting.service.sortinginterface.Sorting;

public class BubbleSort implements Sorting {

	@Override
	public int[] doSort(int[] array) {
		int size = array.length;
		//колличество итераций
		for(int i = 0; i < size; i++) {
			///проверяем элемент с соседом, элемент > соседа меняем их местами
			for(int j = 0; j < (size - i - 1); j++) {//оптимизация size - i - 1 чтобы не до самого конца бежать
				if(array[j] > array[j + 1]) {
					swap(array, j, (j + 1));
				}
			}
		}
		return array;	
	}
	
}
