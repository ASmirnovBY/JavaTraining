package by.smirnov.branching.task28.controller;

import static java.lang.Math.*;

public class Runner {

    private static final int COEFFICIENT = 100;

    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;

        a = (int) (random() * COEFFICIENT);
        b = (int) (random() * COEFFICIENT);
        c = (int) (random() * COEFFICIENT);
        d = (int) (random() * COEFFICIENT);

        System.out.println("a =" + a + " b = " + b
                                + " c = " + c + " d = " + d );

        if(a == d) {
            System.out.println("a = d = " + d);
        } else if(b == d) {
            System.out.println("b = d = " + d);
        } else if(c == d) {
            System.out.println("c = d = " + d);
        } else  {
            System.out.println(max(max(d - a, d - b), d - c));
        }
    }

    private static int max(int a, int b) {
        if(a > b) {
            return a;
        } else {
            return b;
        }
    }
}
