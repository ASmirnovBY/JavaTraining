package by.smirnov.task07.task3.runner;

import by.smirnov.task07.matrix.creator.MatrixCreator;
import by.smirnov.task07.matrix.entity.Matrix;
import by.smirnov.task07.matrix.exceptions.MatrixException;
import by.smirnov.task07.matrix.service.Formation;

public class Runner {
    public static void main(String[] args) {
        MatrixCreator creator = new MatrixCreator();
        try {
            Matrix matrix = new Matrix(3, 5);
            creator.fillRandomized(matrix, 1, 9);
            System.out.println(matrix.toString());
            Formation formation = new Formation();
            Matrix formatedMatrix = formation.matrixFirstAndLastColumn(matrix);
            System.out.println(formatedMatrix.toString());
        } catch (MatrixException e) {
            e.printStackTrace();
        }
    }
}
