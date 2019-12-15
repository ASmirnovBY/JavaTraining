package by.smirnov.branching.ex1.reader.validatorimpl;

import by.smirnov.branching.ex1.reader.readerimpl.ConsoleReader;
import by.smirnov.branching.ex1.reader.readerinterface.Reader;
import by.smirnov.branching.ex1.reader.validatorinterface.Validator;


import java.util.ArrayList;
import java.util.List;

public class ConsoleDateValidator implements Validator<Integer> {
    private Reader reader;

    public ConsoleDateValidator(Reader reader) {
        this.reader = reader;
    }
    @Override
    public List<Integer> getListValidValue() throws Exception {
        return parseInt(reader.read());
    }

    private List<Integer> parseInt(List<String> listFromReader) throws Exception {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(Integer.parseInt(listFromReader.get(0)));
        integerList.add(Integer.parseInt(listFromReader.get(1)));
        integerList.add(Integer.parseInt(listFromReader.get(2)));
        return integerList;
    }

}
