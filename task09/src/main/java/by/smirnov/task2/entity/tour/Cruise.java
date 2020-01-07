package by.smirnov.task2.entity.tour;

import by.smirnov.task2.entity.food.Food;
import by.smirnov.task2.entity.transport.Transport;

import java.util.List;

public class Cruise extends Tour {
    private int ports;

    public Cruise(int id, City city, List<Transport> transports,
                  List<Food> foods, double dayCost, int ports) {
        super(id, city, transports, foods, dayCost);
        this.ports = ports;
    }

    public int getPorts() {
        return ports;
    }

    public void setPorts(int ports) {
        this.ports = ports;
    }

    @Override
    public String toString() {
        return super.toString() + " Cruise{" +
                "ports=" + ports +
                '}';
    }

    @Override
    public String toPrint() {
        return super.toPrint() + " Type=Cruise " +
                "countPort= " + ports;
    }
}
