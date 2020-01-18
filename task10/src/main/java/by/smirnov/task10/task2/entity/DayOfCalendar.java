package by.smirnov.task10.task2.entity;

import java.time.LocalDate;
import java.util.Objects;

public final class DayOfCalendar implements Comparable<DayOfCalendar> {
    private LocalDate date;
    private String description;

    public DayOfCalendar(LocalDate date, String description) {
        this.date = date;
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DayOfCalendar that = (DayOfCalendar) o;
        return date.equals(that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, description);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("day=").append(date.getDayOfMonth()).append(" ");
        sb.append("month=").append(date.getMonth()).append(" ").append(date.getDayOfWeek());
        sb.append(", description='").append(description).append('\'');
        sb.append("");
        return sb.toString();
    }

    @Override
    public int compareTo(DayOfCalendar o) {
        return date.compareTo(o.getDate());
    }
}
