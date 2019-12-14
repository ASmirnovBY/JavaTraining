package by.smirnov.loops.ex1.services.algorithm.algorithmimpl;

import by.smirnov.loops.ex1.services.algorithm.algorithminterface.SumSolveAlgorithm;

import java.util.List;

public class SimpleSum extends SumSolveAlgorithm {

    @Override
    public double getSum(List<Double> numbers) {
        double sum = 0;

        for (Double number : numbers) {
            sum += number;
        }

        return sum;
    }
}
