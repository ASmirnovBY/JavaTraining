package by.smirnov.oop.task1.ui;

public class ConsoleUi implements UserInterface {

    public void show(String str) {
        System.out.println(str);
    }

    public void show(String label, int a) {
        System.out.println(label + " " + a);
    }

}
