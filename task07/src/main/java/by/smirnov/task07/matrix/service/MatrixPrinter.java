package by.smirnov.task07.matrix.service;

public class MatrixPrinter {
    public void printSumAllColumn(int[] sumAllColumn) {
        System.out.println("Sum all column");
        for (int i = 0; i < sumAllColumn.length; i++) {
            System.out.print("column" + (i+1) +" sum=" + sumAllColumn[i]+ ";");
        }
    }
}
