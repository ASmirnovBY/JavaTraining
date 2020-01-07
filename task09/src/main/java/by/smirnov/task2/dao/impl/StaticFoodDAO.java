package by.smirnov.task2.dao.impl;

import by.smirnov.task2.dao.FoodDAO;
import by.smirnov.task2.dao.exception.DAOException;
import by.smirnov.task2.db.FoodTable;
import by.smirnov.task2.entity.food.Food;

import java.util.List;

public class StaticFoodDAO implements FoodDAO {
    @Override
    public List<Food> findAll() throws DAOException {
        FoodTable foodTable = null;
        try {
            foodTable = FoodTable.getINSTANCE();
        } catch (NullPointerException e) {
            throw new DAOException("No food in data base", e);
        }
        return foodTable.getFoods();
    }

    @Override
    public Food findById(int id) throws DAOException {
        FoodTable foodTable = null;
        Food food = null;
        try {
            foodTable = FoodTable.getINSTANCE();
            food = foodTable.findById(id);
        } catch (NullPointerException e) {
            throw new DAOException("No food in data base", e);
        }  catch (IndexOutOfBoundsException e) {
            throw new DAOException("Incorrect id", e);
        }
        return food;
    }
}
