package by.smirnov.task2.db;

import by.smirnov.task2.entity.food.Food;
import by.smirnov.task2.entity.food.FoodType;

import java.util.ArrayList;
import java.util.List;

public class FoodTable {
    private final static FoodTable INSTANCE = new FoodTable();
    private final List<Food> foods = new ArrayList<>();

    private FoodTable() {
        foods.add(new Food(1, FoodType.ALL, 10.5));
        foods.add(new Food(2, FoodType.HALAL, 12.0));
        foods.add(new Food(3, FoodType.KOSHER, 15.0));
        foods.add(new Food(4, FoodType.VEGAN, 16.0));
        foods.add(new Food(5, FoodType.NO, 0));
    }

    public static FoodTable getINSTANCE() {
        return INSTANCE;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public Food findById(int id) {
        return foods.get(id - 1);
    }

}
