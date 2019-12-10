package by.smirnov.branching.task13.controller;

import static java.lang.Math.*;
//Autoginerated test point
public class Runner {

    private static final int COEFFICIENT = 100;

    public static void main(String[] args) {
        int xA, yA; //Point A(x,y)
        int xB, yB; //Point B(x,y)
        double oA;
        double oB;
        String answer = "equal";

        try {
            xA = (int) (random() * COEFFICIENT);
            yA = (int) (random() * COEFFICIENT);
            xB = (int) (random() * COEFFICIENT);
            yB = (int) (random() * COEFFICIENT);

            oA = abs(sqrt((pow(xA, 2) + pow(yA, 2))));
            oB = abs(sqrt((pow(xB, 2) + pow(yB, 2))));
            System.out.println("A(" + xA +"," + yA + ")"
                            + " " + "B(" + xB +"," + yB + ")");

            if (oA < oB) {
                answer = "point A nearer to 0";
            } else if(oA > oB) {
                answer = "point B nearer to 0";
            }

            System.out.println(answer);

        } catch (Exception ex) {
            System.out.println("Ops...error");
        }
    }
}
