package by.smirnov.arrays.services;

public class ArrayOperation {

    public ArrayOperation() {
    }

    public int signFirstElement(int[] array) {
        return (array[0] > 0) ? 1 : ((array[0] < 0) ? -1 : 0);
    }

    public int howPositiveNumber(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count += 1;
            }
        }
        return count;
    }

    public int howNegativeNumber(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                count += 1;
            }
        }
        return count;
    }

    public int howZeroNumber(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                count += 1;
            }
        }
        return count;
    }

    public int howNumberAliquotInRange(int[] array, int aliquotNumber,
                                       int startRange, int endRange) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % aliquotNumber == 0)) {
                if (isInRange(array[i], startRange, endRange)) {
                    count++;
                }
            }
        }
        return count;
    }

    public void printArray(int[] array) {
        for (int e : array) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public void printArray(String label, int[] array) {
        System.out.println(label);
        for (int e : array) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    private boolean isInRange(int number, int startRange, int endRange) {
        return ((number <= endRange) && (number >= startRange));
    }

    public int[] shift(int[] array) {
        int arraySize = array.length;
        int indexlastElement = (arraySize - 1);
        for (int i = 0; i < indexlastElement; i++) {
            array[i] = array[i + 1];
        }
        array[indexlastElement] = 0;
        return array;
    }

    public int[] squeezeArray(int[] array) {
        int arraySize = array.length;
        int indexLastElement = (arraySize - 1);
        int shiftCounter = 0;
        for (int i = 2; i < arraySize; i += 2) {
            shiftCounter++;
            removeAndShift(array, i, shiftCounter);
        }
        zeroComplit(array, shiftCounter);
        return array;
    }

    private void removeAndShift(int[] array, int rightSide, int insertIndex) {
        array[insertIndex] = array[rightSide];
    }

    private void zeroComplit(int[] array, int counter) {
        for (int i = (array.length - 1); i > counter; i--) {
            array[i] = 0;
        }
    }
}
