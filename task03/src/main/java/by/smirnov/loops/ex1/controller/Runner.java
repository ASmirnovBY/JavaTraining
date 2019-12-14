package by.smirnov.loops.ex1.controller;


import by.smirnov.loops.ex1.repository.readerimpl.StaticReader;
import by.smirnov.loops.ex1.repository.readerinterface.Reader;
import by.smirnov.loops.ex1.services.ArrayUtil;
import by.smirnov.loops.ex1.services.algorithm.algorithminterface.SumSolveAlgorithm;
import by.smirnov.loops.ex1.services.algorithm.enums.SumAlgorithmEnum;

import java.util.List;


public class Runner {
    public static void main(String[] args) {
        Reader reader = new StaticReader();
        List<Double> doubleList = reader.read();
        System.out.println("All number in array");
        for (double d : doubleList) {
            System.out.print(d + " ");
        }
        SumSolveAlgorithm algorithmRecursion = SumSolveAlgorithm.getAlgorithm(SumAlgorithmEnum.RECURSION);
        ArrayUtil arrayRecursion = new ArrayUtil(algorithmRecursion);
        System.out.println("\nRecursion sum array is " + algorithmRecursion.getSum(doubleList));
        SumSolveAlgorithm algotithmSimpleLoops = SumSolveAlgorithm.getAlgorithm(SumAlgorithmEnum.SIMPLE_LOOP);
        ArrayUtil arraySimpleLoops = new ArrayUtil(algotithmSimpleLoops);
        System.out.println("Sum simple loops " + algotithmSimpleLoops.getSum(doubleList));

    }
}
