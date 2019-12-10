package by.smirnov.linearalgorithms.task28.controller;

import java.util.Scanner;

import static java.lang.Math.*;

public class Runner {

    private static final int ANGLE = 180;

    private static final int MINUTES_IN_HOUR = 60;

    private static final int SECONDS_IN_MINUTES = 60;

    public static void main(String[] args) {
        Scanner input = null;
        double radianAngle = 0;
        double angelDegree = 0;
        double minutes = 0;
        double seconds = 0;

        try {
            input = new Scanner(System.in);
            System.out.println("Input angle in radian : ");
            radianAngle = Double.parseDouble(input.next());

            angelDegree = ((radianAngle / PI) * ANGLE);
            double angelDegreeBalance = angelDegree % 1;
            minutes = angelDegreeBalance * MINUTES_IN_HOUR;
            double minutesBalance = minutes % 1;
            seconds = minutesBalance * SECONDS_IN_MINUTES;

            angelDegree -= angelDegreeBalance;
            minutes -= minutesBalance;
        } catch (Exception ex) {
            System.out.println("Incorrect input....");
        } finally {
            if (input != null) {
                input.close();
            }
        }

        System.out.println("Your angle in radian is " + angelDegree + " degree, "
                            + minutes + " min, " + seconds + " sec.");

    }
}

