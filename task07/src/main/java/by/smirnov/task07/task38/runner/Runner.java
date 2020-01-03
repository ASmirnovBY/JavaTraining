package by.smirnov.task07.task38.runner;

import by.smirnov.task07.matrix.creator.MatrixCreator;
import by.smirnov.task07.matrix.entity.Matrix;
import by.smirnov.task07.matrix.exceptions.MatrixException;
import by.smirnov.task07.matrix.service.Addition;

public class Runner {
    public static void main(String[] args) {
        try {
            Matrix first = new Matrix(50,50);
            Matrix second = new Matrix(50,50);
            MatrixCreator creator = new MatrixCreator();
            creator.fillRandomized(first, 1, 4);
            creator.fillRandomized(second, 1, 4);
            System.out.println(first);
            System.out.println(second);
            Addition addition = new Addition();
            Matrix added = addition.add(first, second);
            System.out.println("Sum of matrix " + added.toString());
        } catch (MatrixException e) {
            e.printStackTrace();
        }

    }
}
