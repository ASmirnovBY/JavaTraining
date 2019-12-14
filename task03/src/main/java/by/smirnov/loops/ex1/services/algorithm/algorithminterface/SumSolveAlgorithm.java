package by.smirnov.loops.ex1.services.algorithm.algorithminterface;

import by.smirnov.loops.ex1.services.algorithm.algorithmimpl.RecursionSum;
import by.smirnov.loops.ex1.services.algorithm.algorithmimpl.SimpleSum;
import by.smirnov.loops.ex1.services.algorithm.enums.SumAlgorithmEnum;
import java.util.List;

public abstract class SumSolveAlgorithm {
    public abstract double getSum(List<Double> numbers);

    public SumSolveAlgorithm() {

    }

    public static SumSolveAlgorithm getAlgorithm(SumAlgorithmEnum method) {

        switch (method) {
            case RECURSION:
                return new RecursionSum();
            case SIMPLE_LOOP:
                return new SimpleSum();
            default:
                throw new IllegalArgumentException("Incorrect method");
        }
    }

}
