package by.smirnov.branching.task3.controller;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Runner {
    private static final String RIGHT = "Yes";
    private static final String WRONG = "No";
    private static final int COMPARE_NUMBER = 3;

    public static void main(String[] args) {
        Scanner in = null;
        int inputNumber = 0;
        String answer;

        try {
            in = new Scanner(System.in);
            System.out.println("Input your number");
            inputNumber = in.nextInt();
            answer = (inputNumber > COMPARE_NUMBER) ? WRONG : RIGHT;
            System.out.println(answer);

        } catch (Exception ex) {
            System.out.println("Ops...error incorrect input");
        }
    }
}
