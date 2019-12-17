package by.smirnov.decomposition.task3.service;

import by.smirnov.decomposition.reader.readerimpl.ConsoleIntegerReader;

import java.util.List;
import java.util.Scanner;

public class Programm {
    private ArithmeticHelper helper;
    private Scanner scanner;
    private ConsoleIntegerReader reader;
    private int rez;

    public Programm() {
        scanner = new Scanner(System.in);
        reader = new ConsoleIntegerReader(scanner);
        helper = new ArithmeticHelper();
    }

    public void start() {
        List<Integer> integerList;
        try {
            integerList = reader.read();
            int values = integerList.size();
            if (values == 2) {
                rez = helper.nod(integerList.get(0), integerList.get(1));
            } else {
                rez = helper.nod(integerList.get(0), integerList.get(1),
                        integerList.get(2), integerList.get(3));
            }
            print(rez);

        } catch (IllegalArgumentException e) {
            System.out.println("Incorrect inputed... 2 or 4");
        } catch (Exception e) {
            System.out.println("Problems");
        }

    }

    private void print(int rez) {
        System.out.println("Your rez= " + rez);
    }
}
