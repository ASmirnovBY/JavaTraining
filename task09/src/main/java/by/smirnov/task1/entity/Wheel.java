package by.smirnov.task1.entity;

import by.smirnov.task1.exception.CarException;

import java.util.Objects;

public class Wheel {
    private int diameter;
    private WheelDirection direction;
    private boolean isRemoved;

    public Wheel(int diameter, WheelDirection direction) {
        this.diameter = diameter;
        this.direction = direction;
        isRemoved = false;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public WheelDirection getDirection() {
        return direction;
    }

    public void setDirection(WheelDirection direction) {
        this.direction = direction;
    }

    public boolean isReserveWheel() {
        return this.direction.equals(WheelDirection.RESERVE);
    }

    public boolean isRemoved() {
        return isRemoved;
    }

    public void setRemoved(boolean removed) {
        isRemoved = removed;
    }

    public void removeWheel(Wheel onWheel) throws CarException {
        if (onWheel.getDirection().equals(WheelDirection.RESERVE)
         && !(this.direction.equals(WheelDirection.RESERVE))) {
            isRemoved = true;
        } else {
            throw new CarException("You can replace only on reserve wheel");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return diameter == wheel.diameter;
    }

    @Override
    public int hashCode() {
        return Objects.hash(diameter);
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "diameter=" + diameter +
                ", direction=" + direction +
                '}';
    }
}
