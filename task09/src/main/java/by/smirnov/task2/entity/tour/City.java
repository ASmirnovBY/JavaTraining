package by.smirnov.task2.entity.tour;

import java.util.Objects;

public class City {
    private int id;
    private String name;
    private double toCityKm;

    public City(int id, String name, double toCityKm) {
        this.id = id;
        this.name = name;
        this.toCityKm = toCityKm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getToCityKm() {
        return toCityKm;
    }

    public void setToCityKm(double toCityKm) {
        this.toCityKm = toCityKm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return id == city.id &&
                Double.compare(city.toCityKm, toCityKm) == 0 &&
                Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, toCityKm);
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", toCityKm=" + toCityKm +
                '}';
    }
}
