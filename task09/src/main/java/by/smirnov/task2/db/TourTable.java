package by.smirnov.task2.db;

import by.smirnov.task2.entity.tour.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TourTable {
    private final static TourTable INSTANCE = new TourTable();
    private final List<Tour> tours = new ArrayList<>();
    //Добовляем из других дб
    private final CityTable cities = CityTable.getINSTANCE();
    private final FoodTable foods = FoodTable.getINSTANCE();
    private final TransportTable transports = TransportTable.getINSTANCE();

    private TourTable() {
        String[] warsawPlaces = {"Krakowskie Przedmiescie",
                "Copernicus Science Centre", "Museum of the History of Polish Jews",
                "Palace of Culture and Science"
        };
        String[] spPlaces = {"The Winter Palace",
                "Mikhailovskiy Castle", "Stroganov Palace",
                "Anichkov Palace"
        };
        String[] moscowPlaces = {"Grand Kremlin Palace",
                "Cathedral Square", "Armoury Chamber",
                "Tsar Bell and Tsar Cannon"};
        String[] prahaPlaces = {"Prague Castle",
        "Charles Bridge", "Wenceslas Square", "The Clementinum and the National Library"};
        //Туры - Экскурсси Варшава, Питер, Москва, Прага
        tours.add(new Excursion(1,
                cities.getCityById(1),
                transports.findByMoreId(1, 2),
                foods.getFoods(),
                15,
                warsawPlaces
        ));
        tours.add(new Excursion(2,
                cities.getCityById(10),
                transports.findByMoreId(1, 2),
                foods.getFoods(),
                10,
                spPlaces
        ));
        tours.add(new Excursion(3,
                cities.getCityById(5),
                transports.findByMoreId(1, 2),
                foods.getFoods(),
                12,
                moscowPlaces
        ));

        //Лечение санатории РБ
        tours.add(new Therapy(4,
                cities.getCityById(11),
                transports.findByMoreId(1),
                foods.getFoods(),
                10, TherapyType.BRONCHY));
        tours.add(new Therapy(5,
                cities.getCityById(12),
                transports.findByMoreId(1),
                foods.getFoods(),
                10, TherapyType.HEART));
        tours.add(new Therapy(6,
                cities.getCityById(13),
                transports.findByMoreId(1),
                foods.getFoods(),
                10, TherapyType.FOOD_AND_HANDS));
        //За покупками
        tours.add(new Shopping(7,
                cities.getCityById(1),
                transports.findByMoreId(1, 2),
                foods.getFoods(),
                12,
                1000
        ));
        tours.add(new Shopping(8,
                cities.getCityById(2),
                transports.findByMoreId(1),
                foods.getFoods(),
                11,
                500
        ));
        tours.add(new Shopping(9,
                cities.getCityById(8),
                transports.findByMoreId(1),
                foods.getFoods(),
                8,
                500
        ));
        //Круизы
        tours.add(new Cruise(10,
                cities.getCityById(6),
                transports.findByMoreId(2,3),
                foods.getFoods(),
                25,
                3
        ));
        tours.add(new Cruise(11,
                cities.getCityById(7),
                transports.findByMoreId(2,3),
                foods.getFoods(),
                15,
                2
        ));
        tours.add(new Excursion(12,
                cities.getCityById(9),
                transports.findByMoreId(1, 2),
                foods.getFoods(),
                18,
                prahaPlaces
        ));

    }

    public static TourTable getINSTANCE() {
        return INSTANCE;
    }

    public List<Tour> getTours() {
        return tours;
    }
}
