package by.smirnov.task2.entity.tour;

import by.smirnov.task2.entity.food.Food;
import by.smirnov.task2.entity.transport.Transport;

import java.util.Arrays;
import java.util.List;

public class Excursion extends Tour {
    private String[] excursionPlaces;

    public Excursion(int id, City city, List<Transport> transports,
                     List<Food> foods, double dayCost, String[] excursionPlaces) {
        super(id, city, transports, foods, dayCost);
        this.excursionPlaces = excursionPlaces;
    }

    public String[] getExcursionPlaces() {
        return excursionPlaces;
    }

    public void setExcursionPlaces(String[] excursionPlaces) {
        this.excursionPlaces = excursionPlaces;
    }

    @Override
    public String toString() {
        return super.toString() + " Excursion{" +
                "excursionPlaces=" + Arrays.toString(excursionPlaces) +
                '}';
    }

    @Override
    public String toPrint() {
        return super.toPrint()  + " Excursion{" +
            "excursionPlaces=" + Arrays.toString(excursionPlaces) +
                    '}';
    }
}
