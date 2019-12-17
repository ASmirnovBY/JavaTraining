package by.smirnov.decomposition.task8.services;

import by.smirnov.decomposition.utils.RandomArrayGenerate;

import java.util.Scanner;

public class Program {
    private RandomArrayGenerate arrayGenerate;
    private ArrayHelper helper;
    private Scanner scaner;
    private int[] array;
    private int arraySize;


    public Program() {

    }

    public void start() {
        boolean validInput = false;
        do {
            validInput = inputedArraySize();
        } while (!validInput);

        arrayGenerate = new RandomArrayGenerate();
        array = arrayGenerate.getArray(arraySize);
        helper = new ArrayHelper(array);
        print(array, "Array :");
        print(helper.maxElement(), "Max element is");
        print(helper.maxElementAfter(), "Max element before max is");
    }

    private boolean inputedArraySize() {
        scaner = new Scanner(System.in);
        print("Inpute array size, program generate array");
        try {
            arraySize = scaner.nextInt();
            return true;
        } catch (Exception ex) {
            print("Incorrect input try again ");
            return false;
        }


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
