package by.smirnov.task2.entity.tour;

import by.smirnov.task2.entity.food.Food;
import by.smirnov.task2.entity.transport.Transport;

import java.util.List;

public class Therapy extends Tour {
    private TherapyType typeTherapy;

    public Therapy(int id, City city, List<Transport> transports,
                   List<Food> foods, double dayCost, TherapyType typeTherapy) {
        super(id, city, transports, foods, dayCost);
        this.typeTherapy = typeTherapy;
    }

    public TherapyType getTypeTherapy() {
        return typeTherapy;
    }

    public void setTypeTherapy(TherapyType typeTherapy) {
        this.typeTherapy = typeTherapy;
    }

    @Override
    public String toString() {
        return super.toString() + "Therapy{" +
                "typeTherapy='" + typeTherapy + '\'' +
                '}';
    }

    @Override
    public String toPrint() {
        return super.toPrint() + " Therapy{" +
                "typeTherapy='" + typeTherapy + '\'' +
                '}';
    }
}
