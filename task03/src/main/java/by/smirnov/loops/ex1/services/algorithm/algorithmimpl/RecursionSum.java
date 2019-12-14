package by.smirnov.loops.ex1.services.algorithm.algorithmimpl;

import by.smirnov.loops.ex1.services.algorithm.algorithminterface.SumSolveAlgorithm;

import javax.swing.*;
import java.util.List;

public class RecursionSum extends SumSolveAlgorithm {

    @Override
    public double getSum(List<Double> numbers) {
        int arrayLength = numbers.size();
        return sumRecursion(numbers, arrayLength - 1);
    }

    private double sumRecursion(List<Double> array, int count) {
        if (count == 0) {
            return array.get(0);
        } else {
            return array.get(count) + sumRecursion(array, (count - 1));
        }
    }

}
