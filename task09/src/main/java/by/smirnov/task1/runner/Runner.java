package by.smirnov.task1.runner;

import by.smirnov.task1.entity.Car;
import by.smirnov.task1.entity.Wheel;
import by.smirnov.task1.exception.CarException;

public class Runner {
    public static void main(String[] args) {
        Car bmw = new Car();// конструктор по умолчанию создает БМВ
        try {
            bmw.fillCar(80);
            bmw.moveForward();
            bmw.moveForward();
            bmw.moveRight();
            bmw.moveLeft();
            bmw.stop();
            Wheel remove = bmw.getWheels().get(0);
            Wheel onWheel = bmw.getWheels().get(4);
            System.out.println(bmw);
            bmw.replaceWheel(remove, onWheel);
            System.out.println(bmw);
        } catch (CarException e) {
            e.printStackTrace();
        }
    }
}
