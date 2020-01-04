package by.smirnov.task1.entity;

import by.smirnov.task1.exception.CarException;

import java.util.Objects;

public class Engine {
    private double maxVolume;// максимальный обьем бака
    private double volume;//объем бака
    private int enginePower;//мощьность двигателя(лошадиных сил)
    private boolean isWork;//флаг запущен ли двигатель

    public Engine() {
        this(80, 240);
    }

    public Engine(double maxVolume, int enginePower) {
        this.maxVolume = maxVolume;
        this.enginePower = enginePower;
        isWork = false;
        this.volume = 0.0;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public double getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(double maxVolume) {
        this.maxVolume = maxVolume;
    }

    public boolean isWork() {
        return isWork;
    }

    public void setWork(boolean work) {
        isWork = work;
    }

    public void start() {
        if (this.volume != 0) {
            isWork = true;
            System.out.println("Engine start");
        } else {
            System.out.println("No benzine");
        }
    }

    public void stop() {
        isWork = false;
        System.out.println("Engine stop");
    }

    public void fillTank(double benzineLiters) throws CarException {
        if (((this.volume + benzineLiters) <= maxVolume)
                && (this.volume + benzineLiters != 0)) {
           this.volume += benzineLiters;
        } else {
            throw new CarException("Back is more full or hasn't benzine");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return Double.compare(engine.volume, volume) == 0 &&
                enginePower == engine.enginePower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(volume, enginePower);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume + " Liters " +
                ", enginePower=" + enginePower + " horses" +
                '}';
    }
}
