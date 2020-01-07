package by.smirnov.task2.db;

import by.smirnov.task2.entity.transport.Transport;
import by.smirnov.task2.entity.transport.TransportType;

import java.util.ArrayList;
import java.util.List;

public class TransportTable {
    private final static TransportTable INSTANCE = new TransportTable();
    private final List<Transport> transports = new ArrayList<>();

    private TransportTable() {
        transports.add(new Transport(1, TransportType.BUS, 0.25));
        transports.add(new Transport(2, TransportType.PLANE, 0.5));
        transports.add(new Transport(3, TransportType.SHIP, 1.0));
    }

    public static TransportTable getINSTANCE() {
        return INSTANCE;
    }

    public List<Transport> getTransports() {
        return transports;
    }

    public Transport findById(int id) {
        return transports.get(id - 1);
    }

    public List<Transport> findByMoreId(int...args) {
        List<Transport> transportList = new ArrayList<>();
        for (int id : args) {
            transportList.add(transports.get(id - 1));
        }
        return transportList;
    }
}
