package by.smirnov.task2.entity.tour;

import by.smirnov.task2.entity.food.Food;
import by.smirnov.task2.entity.transport.Transport;

import java.util.List;

public class Shopping extends Tour {
    private double maxPay;

    public Shopping(int id, City city, List<Transport> transports,
                    List<Food> foods, double dayCost, double maxPay) {
        super(id, city, transports, foods, dayCost);
        this.maxPay = maxPay;
    }

    public double getMaxPay() {
        return maxPay;
    }

    public void setMaxPay(double maxPay) {
        this.maxPay = maxPay;
    }

    @Override
    public String toString() {
        return super.toString() + " Shopping{" +
                "maxPay=" + maxPay +
                '}';
    }

    @Override
    public String toPrint() {
        return super.toPrint()  + " Shopping{" +
                "maxPay=" + maxPay +
                '}';
    }
}
