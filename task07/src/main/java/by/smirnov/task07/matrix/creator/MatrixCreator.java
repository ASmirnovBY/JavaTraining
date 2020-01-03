package by.smirnov.task07.matrix.creator;

import by.smirnov.task07.matrix.creator.parser.MatrixFileParser;
import by.smirnov.task07.matrix.entity.Matrix;
import by.smirnov.task07.matrix.exceptions.MatrixException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;


public class MatrixCreator {
    public void fillRandomized(Matrix t, int start, int end) {
        int v = t.getVerticalSize();
        int h = t.getHorizontalSize();
        for(int i = 0; i < v; i++) {
            for(int j = 0; j < h; j++) {
                try {
                    int value = ((int)(Math.random() * (end - start) + start));
                    t.setElement(i, j, value);
                } catch (MatrixException e) {
                    /* в данном случае exception невозможен, поэтому обработка отсутствует */
                }
            }
        }
    }

    public Matrix fillFromFile(File file) throws MatrixException {
        Matrix matrix = null;
        try {
            List<String> rows = Files.lines(Paths.get(file.getPath()))
                    .collect(Collectors.toList());
            MatrixFileParser parser = new MatrixFileParser();
            matrix = parser.parse(rows);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return matrix;
    }
}
