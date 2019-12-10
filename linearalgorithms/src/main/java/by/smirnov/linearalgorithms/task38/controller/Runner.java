package by.smirnov.linearalgorithms.task38.controller;

import java.util.Scanner;
//Task 38(b)
public class Runner {
    public static void main(String[] args) {
        boolean isInRange = false;
        Scanner in = null;
        int x = 0;
        int y = 0;

        try {
            in = new Scanner(System.in);
            System.out.println("Input x : ");
            x = in.nextInt();
            System.out.println("Input y : ");
            y = in.nextInt();
            isInRange = (((x >= -4) && (x <= 4)) && ((y <= 0) && (y >= -3)))
                    || (((x >= -2) && (x <= 2)) && ((y >= 0) && (y <= 4)));
        } catch (Exception ex) {
            System.out.println("Ops...error, incorrect input");
        }
        finally {
            if(in != null) {
                in.close();
            }
        }

        System.out.println("Result " + isInRange);
    }
}
