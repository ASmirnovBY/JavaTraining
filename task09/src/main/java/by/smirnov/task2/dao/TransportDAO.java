package by.smirnov.task2.dao;

import by.smirnov.task2.dao.exception.DAOException;
import by.smirnov.task2.entity.transport.Transport;

import java.util.List;

public interface TransportDAO {
    List<Transport> findAll() throws DAOException;
    Transport findById(int id) throws DAOException;
}
