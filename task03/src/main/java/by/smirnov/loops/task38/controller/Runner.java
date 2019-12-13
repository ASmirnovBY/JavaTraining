package by.smirnov.loops.task38.controller;

import by.smirnov.loops.task38.reader.readerimpl.ConsoleNumberReader;
import by.smirnov.loops.task38.reader.readerinterface.Reader;
import by.smirnov.loops.task38.service.NumberAnalyzer;

public class Runner {
    public static void main(String[] args) {
        Reader reader = new ConsoleNumberReader();
        NumberAnalyzer analyzer = new NumberAnalyzer(reader);
        System.out.println(analyzer.digitHasArithmeticProgression());
    }
}
