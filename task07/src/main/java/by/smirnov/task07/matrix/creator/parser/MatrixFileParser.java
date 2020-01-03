package by.smirnov.task07.matrix.creator.parser;

import by.smirnov.task07.matrix.entity.Matrix;
import by.smirnov.task07.matrix.exceptions.MatrixException;

import java.util.List;

public class MatrixFileParser {
    public static final String DELIMETR = " ";

    public Matrix parse(List<String> linesFromFile) throws MatrixException {
        Matrix matrix = null;
        if (!linesFromFile.isEmpty()) {
            int n = linesFromFile.size();
            int m = linesFromFile.get(0).split(DELIMETR).length;
            String[] columns;
            try {
                matrix = new Matrix(n, m);
                for (int row = 0; row < n; row++) {
                    columns = linesFromFile.get(row).split(DELIMETR);
                    for (int column = 0; column < m; column++) {
                        int value = Integer.parseInt(columns[column]);
                        matrix.setElement(row, column, value);
                    }
                }
            } catch (MatrixException e) {
                e.printStackTrace();
            }

        }
        return matrix;
    }
}
