package by.smirnov.branching.ex1.reader.validatorinterface;

import java.util.List;

public interface Validator<T> {
    List<T> getListValidValue() throws Exception;
}
