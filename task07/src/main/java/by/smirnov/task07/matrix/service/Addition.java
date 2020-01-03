package by.smirnov.task07.matrix.service;

import by.smirnov.task07.matrix.entity.Matrix;
import by.smirnov.task07.matrix.exceptions.MatrixException;

public class Addition {
    public Matrix add(Matrix f, Matrix s) throws MatrixException {
        if (!isValid(f, s)) {
            throw new MatrixException("Incorrect size matrix must be equals");
        }

        int rows = s.getVerticalSize();
        int columns = s.getHorizontalSize();
        Matrix rezult = new Matrix(rows, columns);

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                rezult.setElement(row, column, sumElement(f, s, row, column));
            }
        }
        return rezult;
    }

    private boolean isValid(Matrix f, Matrix s) {
        return (f.getHorizontalSize() == s.getHorizontalSize())
                && (f.getVerticalSize() == s.getVerticalSize());
    }

    private int sumElement(Matrix f, Matrix s, int i, int j) throws MatrixException {
        return f.getElement(i, j) + s.getElement(i, j);
    }
}
