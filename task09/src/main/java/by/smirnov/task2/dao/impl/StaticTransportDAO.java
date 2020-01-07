package by.smirnov.task2.dao.impl;

import by.smirnov.task2.dao.TransportDAO;
import by.smirnov.task2.dao.exception.DAOException;
import by.smirnov.task2.db.TransportTable;
import by.smirnov.task2.entity.transport.Transport;

import java.util.List;

public class StaticTransportDAO implements TransportDAO {
    @Override
    public List<Transport> findAll() throws DAOException {
        TransportTable transportTable = null;
        try {
            transportTable = TransportTable.getINSTANCE();
        } catch (NullPointerException e) {
            throw new DAOException("No transport in data base", e);
        }
        return transportTable.getTransports();
    }

    @Override
    public Transport findById(int id) throws DAOException {
        TransportTable transportTable = null;
        Transport transport = null;
        try {
            transportTable = TransportTable.getINSTANCE();
            transport = transportTable.findById(id);
        } catch (NullPointerException e) {
            throw new DAOException("No transport in data base", e);
        } catch (IndexOutOfBoundsException e) {
            throw new DAOException("Incorrect id", e);
        }
        return transport;
    }
}
