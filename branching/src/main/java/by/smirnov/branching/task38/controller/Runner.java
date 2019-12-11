package by.smirnov.branching.task38.controller;

import java.util.Scanner;
import static java.lang.Math.pow;

public class Runner {
    public static void main(String[] args) {
        Scanner in = null;

        try {
            in = new Scanner(System.in);
            int x = in.nextInt();
            System.out.println(solution(x));
        } catch (Exception ex) {
            System.out.println("Oups....error, try again");
        }
    }

    private static int solution(int x) {
        if((x >= 0) && (x <= 3)) {
            return (int) (pow(x, 2));
        } else {
            return 4;
        }
    }
}
