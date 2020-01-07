package by.smirnov.task2.entity.food;

import java.util.Objects;

public class Food {
    private int id;
    private FoodType foodType;
    private double cost;

    public Food(int id, FoodType foodType, double cost) {
        this.id = id;
        this.foodType = foodType;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return id == food.id &&
                Double.compare(food.cost, cost) == 0 &&
                foodType == food.foodType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, foodType, cost);
    }

    @Override
    public String toString() {
        return foodType.toString();
    }
}
