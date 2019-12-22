package by.smirnov.decomposition.task18.controller;

import by.smirnov.decomposition.task18.service.NumericalCreater;

public class Runner {
    public static void main(String[] args) {
        NumericalCreater creater = new NumericalCreater();
        creater.printStrictlyIncreasingNum(1, "", 4);
    }
}
