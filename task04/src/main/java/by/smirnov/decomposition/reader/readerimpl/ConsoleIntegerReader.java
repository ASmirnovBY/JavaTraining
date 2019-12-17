package by.smirnov.decomposition.reader.readerimpl;

import by.smirnov.decomposition.reader.readerinterface.Reader;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleIntegerReader implements Reader<Integer> {
    private Scanner in;

    public ConsoleIntegerReader(Scanner scanner) {
        in = scanner;
    }

    public List<Integer> read() throws Exception {
        List<Integer> inputedList = new ArrayList<Integer>();
        System.out.println("Do you want NOD 2 or 4 number");
        inputedList = howValueReturn(in.nextInt());
        return inputedList;
    }

    private List<Integer> howValueReturn(int a) {
        switch (a) {
            case 2:
                return addTwoValues();
            case 4:
                return addFourValues();
            default:
                throw new IllegalArgumentException("You input" + a);
        }
    }

    private List<Integer> addTwoValues() {
        List<Integer> values = new ArrayList<Integer>();
        System.out.println("Inpute first number");
        int val1 = in.nextInt();
        values.add(val1);
        System.out.println("Inpute second number");
        int val2 = in.nextInt();
        values.add(val2);
        return values;
    }

    private List<Integer> addFourValues() {
        List<Integer> values = addTwoValues();
        System.out.println("Inpute third number");
        int val3 = in.nextInt();
        values.add(val3);
        System.out.println("Inpute fourth number");
        int val4 = in.nextInt();
        values.add(val4);
        return values;
    }
}
