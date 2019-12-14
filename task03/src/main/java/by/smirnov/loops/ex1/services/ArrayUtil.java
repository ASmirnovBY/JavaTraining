package by.smirnov.loops.ex1.services;

import by.smirnov.loops.ex1.services.algorithm.algorithminterface.SumSolveAlgorithm;

import java.util.List;

public class ArrayUtil {
    private SumSolveAlgorithm algorithm;

    public ArrayUtil(SumSolveAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public double getSum(List<Double> numbers) {
        return algorithm.getSum(numbers);
    }
}
