package by.smirnov.oop.task1.service;

import by.smirnov.oop.task1.entity.Test1;

public class Updater {
    public void update(Test1 obj, Integer a, Integer b) {
        obj.setA(a);
        obj.setB(b);
    }

    public int sum(Test1 obj) {
        return obj.getA() + obj.getB();
    }

    public int max(Test1 obj) {
        return (obj.getA() > obj.getB()) ? obj.getA() : obj.getB();
    }
    //Реализовать сумму
}
