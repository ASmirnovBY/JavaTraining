package by.smirnov.branching.task3.controller;

import java.util.Scanner;

public class Runner {

    private static final int COMPARE_NUMBER = 3;

    public static void main(String[] args) {
        Scanner in = null;
        int inputNumber = 0;

        try {
            in = new Scanner(System.in);
            System.out.println("Input your number");
            inputNumber = in.nextInt();

            if(inputNumber > COMPARE_NUMBER) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }

        } catch (Exception ex) {
            System.out.println("Ops...error incorrect input");
        }
    }
}
