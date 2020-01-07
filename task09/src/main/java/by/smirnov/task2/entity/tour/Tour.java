package by.smirnov.task2.entity.tour;

import by.smirnov.task2.entity.food.Food;
import by.smirnov.task2.entity.transport.Transport;

import java.util.List;
import java.util.Objects;

public abstract class Tour {
    private int id;
    private City city;
    private List<Transport> transport;
    private List<Food> foods;
    private double dayCost;

    public Tour(int id, City city, List<Transport> transport, List<Food> foods, double dayCost) {
        this.id = id;
        this.city = city;
        this.transport = transport;
        this.foods = foods;
        this.dayCost = dayCost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Transport> getTransport() {
        return transport;
    }

    public void setTransport(List<Transport> transport) {
        this.transport = transport;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }

    public double getDayCost() {
        return dayCost;
    }

    public void setDayCost(double dayCost) {
        this.dayCost = dayCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tour tour = (Tour) o;
        return id == tour.id &&
                Double.compare(tour.dayCost, dayCost) == 0 &&
                Objects.equals(city, tour.city) &&
                Objects.equals(transport, tour.transport) &&
                Objects.equals(foods, tour.foods);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, city, transport, foods, dayCost);
    }

    @Override
    public String toString() {
        return "Tour{" +
                "id=" + id +
                ", city=" + city +
                ", transport=" + transport +
                ", foods=" + foods +
                ", dayCost=" + dayCost +
                '}';
    }

    public String toPrint() {
        StringBuilder builder = new StringBuilder();
        builder.append("id=").append(id).append(",")
                .append(" City=").append(city.getName()).append(",")
                .append(transport.toString()).append(", ")
                .append(foods.toString()).append(", ")
                .append(" costInDay=").append(dayCost);
        return builder.toString();
    }
}
