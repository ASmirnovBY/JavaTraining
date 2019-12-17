package by.smirnov.decomposition.task8.services;

public class ArrayHelper {
    private int[] array;

    public ArrayHelper(int[] array) {
        this.array = array;
    }

    public int maxElement() {
        int max = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int maxElementAfter() {
        int maxElement = maxElement();
        int maxElementBefore = array[0];
        for(int i = 0; i < array.length; i++) {
            if(maxElement == array[i]) {
                ++i;
            }

            if(maxElementBefore < array[i]) {
                maxElementBefore = array[i];
            }
        }
        return maxElementBefore;
    }
}
