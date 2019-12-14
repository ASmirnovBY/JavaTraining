package by.smirnov.loops.ex1.repository.readerimpl;

import by.smirnov.loops.ex1.repository.readerinterface.Reader;
import static java.lang.Math.*;

import java.util.ArrayList;
import java.util.List;

public class StaticReader implements Reader {
    private List<Double> numbers;

    public StaticReader() {
        numbers = new ArrayList<>();
    }

    @Override
    public List<Double> read() {
        generateNumber(5);
        return numbers;
    }

    private void generateNumber(int count) {
        for(int i = 0; i < count; i++) {
            Double nextNumber = (random() * 150);
            numbers.add(nextNumber);
        }
    }
}
