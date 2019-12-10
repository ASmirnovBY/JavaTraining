package by.smirnov.linearalgorithms.task3.controller;

import java.util.Scanner;
import static java.lang.Math.random;

public class Runner {

    private static final String FUNCTION_Z = "2*x+(y-2)*5";

    private static final int COEFFICIENT = 10;

    public static void main(String[] args) {
        Scanner input = null;
        int x = 0;
        int y = 0;
        int result = 0;

        try {
            System.out.println("f(x) = " + FUNCTION_Z);
            input = new Scanner(System.in);
            System.out.println("Input x : ");
            x = input.nextInt();
            System.out.println("Input y : ");
            y = input.nextInt();
        } catch (Exception ex) {
            System.out.println("Incorrect input....");
            x = (int) (random() * COEFFICIENT);
            y = (int) (random() * COEFFICIENT);
            System.out.println("Random x= " + x + " y= " + y);
        } finally {
            if (input != null) {
                input.close();
            }
        }

        result = 2 * x + (y - 2 ) * 5;
        System.out.println("f(z)=" + FUNCTION_Z + "  f(z) = " + result);
    }
}
