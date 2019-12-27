package by.smirnov.oop.apphospital.dao;

import by.smirnov.oop.apphospital.dao.exception.DAOException;

import java.io.IOException;
import java.util.List;

public interface CrudDao<T> {
    List<T> findAll() throws DAOException;
    void insert(T object) throws DAOException;
}
