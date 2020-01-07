package by.smirnov.task2.entity.transport;

import java.util.Objects;

public class Transport {
    private int id;
    private TransportType transportType;
    private double costOnKm;

    public Transport(int id, TransportType transportType,
                     double costOnKm) {
        this.id = id;
        this.transportType = transportType;
        this.costOnKm = costOnKm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TransportType getTransportType() {
        return transportType;
    }

    public void setTransportType(TransportType transportType) {
        this.transportType = transportType;
    }

    public double getCostOnKm() {
        return costOnKm;
    }

    public void setCostOnKm(double costOnKm) {
        this.costOnKm = costOnKm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return id == transport.id &&
                Double.compare(transport.costOnKm, costOnKm) == 0 &&
                transportType == transport.transportType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, transportType, costOnKm);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(transportType.toString());
        return "Transport " + builder.toString();
    }

    public String toPrint() {
        StringBuilder builder = new StringBuilder();
        builder.append("Transport =[").append(transportType.toString()).append("]");
        return builder.toString();
    }

}
