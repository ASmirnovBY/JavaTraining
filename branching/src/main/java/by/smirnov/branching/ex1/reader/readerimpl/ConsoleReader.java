package by.smirnov.branching.ex1.reader.readerimpl;

import by.smirnov.branching.ex1.reader.readerinterface.Reader;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleReader implements Reader {
    private Scanner scanner;

    public ConsoleReader() {
        this.scanner = new Scanner(System.in);
    }
    @Override
    public List<String> read() {
        scanner = new Scanner(System.in);
        List<String> inputed = new ArrayList<>();
        System.out.println("Input day :");
        inputed.add(scanner.next());
        System.out.println("Inputed month");
        inputed.add(scanner.next());
        System.out.println("Inputed year");
        inputed.add(scanner.next());
        scanner.close();
        return inputed;
    }
}
