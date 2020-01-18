package by.smirnov.task10.task2.utils.parser;

import by.smirnov.task10.task2.utils.parser.exception.ParserException;

public interface Parser<T> {
    T parse(String strObg, int param) throws ParserException;
}
