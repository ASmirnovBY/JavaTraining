package by.smirnov.task07.task28.runner;

import by.smirnov.task07.matrix.creator.MatrixCreator;
import by.smirnov.task07.matrix.entity.Matrix;
import by.smirnov.task07.matrix.exceptions.MatrixException;
import by.smirnov.task07.matrix.service.MatrixPrinter;
import by.smirnov.task07.matrix.service.MatrixUtils;

public class Runner {
    public static void main(String[] args) {
        try {
            Matrix matrix = new Matrix(5, 5);
            MatrixCreator matrixCreator = new MatrixCreator();
            matrixCreator.fillRandomized(matrix, 1, 10);
            System.out.println(matrix);
            MatrixUtils matrixUtils = new MatrixUtils();
            int[] sum = matrixUtils.sumOfAllColumn(matrix);
            MatrixPrinter printer = new MatrixPrinter();
            printer.printSumAllColumn(sum);
            int indexOfColumnsWithMaxSum = matrixUtils.indexColumnWithMaxSumInColumn(matrix);
            System.out.println("\nMax sum is column " + (indexOfColumnsWithMaxSum + 1));
        } catch (MatrixException e) {
            e.printStackTrace();
        }
    }
}
