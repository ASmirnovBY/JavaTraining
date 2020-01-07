package by.smirnov.task2.db;

import by.smirnov.task2.entity.tour.City;

import java.util.ArrayList;
import java.util.List;

public class CityTable {
    private final static CityTable INSTANCE = new CityTable();
    private final List<City> cities = new ArrayList<>();

    private CityTable() {
        cities.add(new City(1,"Warsaw", 546));
        cities.add(new City(2,"Vilnus", 168));
        cities.add(new City(3,"Berlin", 1416));
        cities.add(new City(4,"Paris", 2119));
        cities.add(new City(5,"Moscow", 718));
        cities.add(new City(6, "Madrid", 2936));
        cities.add(new City(7, "Stambul", 2300));
        cities.add(new City(8,"Lvov", 615));
        cities.add(new City(9, "Praha", 1211));
        cities.add(new City(10,"St. Petersburg", 832));
        cities.add(new City(11,"Lepel", 200));
        cities.add(new City(12,"Hrodno", 350));
        cities.add(new City(13,"Bereza", 50));
    }

    public static CityTable getINSTANCE() {
        return INSTANCE;
    }

    public List<City> getCities() {
        return cities;
    }

    public City getCityById(int id) {
        return cities.get(id - 1);
    }
}
