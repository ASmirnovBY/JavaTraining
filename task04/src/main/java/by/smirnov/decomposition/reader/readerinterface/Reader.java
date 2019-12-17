package by.smirnov.decomposition.reader.readerinterface;

import java.util.List;

public interface Reader<T> {
    List<T> read() throws Exception;
}
