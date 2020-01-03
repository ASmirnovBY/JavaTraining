package by.smirnov.task07.matrix.service;

import by.smirnov.task07.matrix.entity.Matrix;
import by.smirnov.task07.matrix.exceptions.MatrixException;

public class MatrixUtils {

    public int sumOfColumn(Matrix matrix, int j) throws MatrixException {
        int sum = 0;
        if (matrix != null) {
            for(int i = 0; i < matrix.getVerticalSize(); i++) {
                sum += matrix.getElement(i, j);//будем считать колоник от 1...n не от 0
            }
        }
        else {
            throw new MatrixException();
        }
        return sum;
    }

    public int[] sumOfAllColumn (Matrix matrix) throws MatrixException {
        int[] sumOfAllColumn;
        if (matrix != null) {
            int numColumns = matrix.getVerticalSize();
            sumOfAllColumn = new int[numColumns];
            for (int j = 0; j < numColumns; j++) {
                sumOfAllColumn[j] = sumOfColumn(matrix, j);
            }
        } else {
            throw new MatrixException();
        }
        return sumOfAllColumn;
    }

    public int indexColumnWithMaxSumInColumn(Matrix matrix) throws MatrixException {
        int[] allSum;
        int maxSumIs;
        int indexColumnMaxSum = 0;
        if(matrix != null) {
           allSum = sumOfAllColumn(matrix);
           maxSumIs = allSum[0];
           for (int i = 1; i < allSum.length; i++) {
               if(allSum[i] > maxSumIs) {
                   maxSumIs = allSum[i];
                   indexColumnMaxSum = i;
               }
           }
        } else {
            throw new MatrixException();
        }
        return indexColumnMaxSum;
    }
}
