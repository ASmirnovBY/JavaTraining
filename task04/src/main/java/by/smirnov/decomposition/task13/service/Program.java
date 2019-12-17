package by.smirnov.decomposition.task13.service;

import by.smirnov.decomposition.utils.RandomIntegerGenerate;

public class Program {
    private ArrayBuilder arrayBuilder;
    private RandomIntegerGenerate generate;

    public Program() {
        arrayBuilder = new ArrayBuilder();
        generate = new RandomIntegerGenerate();
    }

    public void start() {
        int number = generate.getInt();
        int[] array = arrayBuilder.generateIntNumberToArray(number);
        print(array, "Array number " + number);
    }

    private void print(int element, String label) {
        System.out.println(label + " " + element);
    }

    private void print(int[] array, String label) {
        System.out.print(label + " ");
        for(int e : array) {
            System.out.print(e + " ");
        }
        System.out.println("");
    }

    private void print(String message) {
        System.out.println(message);
    }
}
