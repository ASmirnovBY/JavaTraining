package by.smirnov.task07.matrix.service;

import by.smirnov.task07.matrix.entity.Matrix;
import by.smirnov.task07.matrix.exceptions.MatrixException;

public class Formation {
    private static final int COUNT_COLUMN = 2;

    public void evenMatrixFormation(Matrix matrix) throws MatrixException {
        if (matrix.getHorizontalSize() % 2 == 0) {
            int n = matrix.getHorizontalSize();
            int temp = n; //хранения размерности для отображения
            for (int i = 0; i < n; i++) {
                if ((i % 2) == 0) {
                    for (int j = 0; j < n; j++) {
                        matrix.setElement(i, j, (j + 1));
                    }
                } else {
                    for (int j = 0; j < n; j++) {
                        matrix.setElement(i, j, temp);
                        temp--;
                    }
                }
                temp = n;
            }
        } else {
            throw new MatrixException("Only even size");
        }
    }

    public Matrix matrixFirstAndLastColumn(Matrix matrix) throws MatrixException {//Вывести(сформировать) на экран первый и последний столбцы.
        if (matrix != null) {
            int indexFirstColumn = 0;
            int indexLastColumn = matrix.getHorizontalSize() - 1;
            Matrix formatedMatrix = new Matrix(matrix.getVerticalSize(), COUNT_COLUMN);
            for (int i = 0; i < matrix.getVerticalSize(); i++) {
                formatedMatrix.setElement(i, indexFirstColumn, matrix.getElement(i, indexFirstColumn));
                formatedMatrix.setElement(i, (COUNT_COLUMN - 1), matrix.getElement(i, indexLastColumn));
            }
            return formatedMatrix;
        } else {
            throw new MatrixException("null matrix");
        }

    }
}
