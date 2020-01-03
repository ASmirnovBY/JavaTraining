package by.smirnov.task07.task13.runner;

import by.smirnov.task07.matrix.entity.Matrix;
import by.smirnov.task07.matrix.exceptions.MatrixException;
import by.smirnov.task07.matrix.service.Formation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input n, must be even");
        try {
            int size = scanner.nextInt();
            Matrix matrix = new Matrix(size);
            Formation formation = new Formation();
            formation.evenMatrixFormation(matrix);
            System.out.println(matrix);
        } catch (MatrixException e) {
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("Only even number not word");
        }
    }
}
