package by.smirnov.linearalgorithms.task13.controller;

import static java.lang.Math.*;
//All point generate Math.random()
public class Runner {

    private static final int COEFFICIENT = 100;

    public static void main(String[] args) {
        int xA, yA; //Coordinates point A
        int xB, yB; //Coordinates point B
        int xC, yC; //Coordinates point C
        double dAB;
        double dAC;
        double dBC;
        double perimeter;
        double square;

        try {
            xA = (int) (random() * COEFFICIENT);
            yA = (int) (random() * COEFFICIENT);
            xB = (int) (random() * COEFFICIENT);
            yB = (int) (random() * COEFFICIENT);
            xC = (int) (random() * COEFFICIENT);
            yC = (int) (random() * COEFFICIENT);

            dAB = sqrt(pow((xB - xA), 2) + pow((yB - yA), 2));
            dAC = sqrt(pow((xC - xA), 2) + pow((yC - yA), 2));
            dBC = sqrt(pow((xC - xB), 2) + pow((yC - yB), 2));

            perimeter = (dAB + dAC + dBC);
            square = abs(((xB - xA) * (yC - yA) - (xC - xA) * (yB - yA)) * 1/2);

            System.out.println("A(" + xA + ", " + yA + ") "
                                + "B(" + xB + ", " + yB + ") "
                                        + "C(" + xC + ", " + yC + ") ");

            System.out.println("Perimeter is " + perimeter);
            System.out.println("Square is " + square);
        } catch (Exception ex) {
            System.out.println("Ops... error, try again");
        }
    }
}
