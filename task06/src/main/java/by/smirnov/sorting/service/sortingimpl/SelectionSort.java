package by.smirnov.sorting.service.sortingimpl;

import by.smirnov.sorting.service.sortinginterface.Sorting;

public class SelectionSort implements Sorting {

	@Override
	public int[] doSort(int[] array) {
		int iMin;
		for(int i = 0; i < array.length; i++ ) {
			iMin = indexMinElement(array, i);
			swap(array, iMin, i);
		}
		return array;
	}
	
	protected int indexMinElement(int[] array,int indexMinLine) {
		int minElement = array[indexMinLine];
		int indexMinElement = indexMinLine;
		for(int i = indexMinLine; i < array.length; i++) {
			if(minElement > array[i]) {
				minElement = array[i];
				indexMinElement = i;		
			}
		}
		return indexMinElement;
	}
	
}
