package by.smirnov.task2.dao;

import by.smirnov.task2.dao.exception.DAOException;
import by.smirnov.task2.entity.food.Food;

import java.util.List;

public interface FoodDAO {
    List<Food> findAll() throws DAOException;
    Food findById(int id) throws DAOException;
}
