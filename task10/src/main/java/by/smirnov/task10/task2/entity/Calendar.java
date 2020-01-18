package by.smirnov.task10.task2.entity;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Calendar implements Serializable {
    private static final long serialVersionUID = 1L;

    private static final int START_MONTH_DAY_IN_YEAR = 1;

    private static final String WORK_DAY = "Work day";

    private static final String WEEKEND_DAY = "Weekend";

    private int year;
    private RestDayContainer dayContainer;

    public Calendar() {
        this(2020);
    }

    public Calendar(int year) {
        this.year = year;
        dayContainer = new RestDayContainer();
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean addHoliday(DayOfCalendar day) {
        return dayContainer.addHoliday(day);
    }

    public void buildWorkAndRestDays() {
        dayContainer.initialWeekend();
        dayContainer.initialWorkDay();
        dayContainer.workAndRestDays();
    }

    public void buildWeekendDay() {dayContainer.initialWeekend();}

    public void buildWorkDay() {
        dayContainer.initialWorkDay();
    }

    public void buildWorkAndWeekendDays() {
        dayContainer.initialWorkWeekendDays();
    }

    public Set<DayOfCalendar> getWorkDays() {
        return dayContainer.workDay;
    }

    public Set<DayOfCalendar> getWeekendDays() {
        return dayContainer.weekends;
    }

    public Set<DayOfCalendar> getHolidayDays() {
        return dayContainer.holidays;
    }

    public Set<DayOfCalendar> getAllCalendar() {
        return dayContainer.allDays;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calendar calendar = (Calendar) o;
        return year == calendar.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Calendar of ");
        sb.append("year=").append(year);
        sb.append("\n");
        for (DayOfCalendar day : dayContainer.allDays) {
            sb.append(day).append("\n");
        }
        return sb.toString();
    }

    protected class RestDayContainer {
        private Set<DayOfCalendar> weekends = new TreeSet<>();
        private Set<DayOfCalendar> holidays = new TreeSet<>();
        private Set<DayOfCalendar> workDay = new TreeSet<>();
        private Set<DayOfCalendar> allDays = new TreeSet<>();

        private RestDayContainer() {}

        private void initialWorkWeekendDays() {
            LocalDate day = LocalDate.of(Calendar.this.year,
                    Calendar.START_MONTH_DAY_IN_YEAR,
                    Calendar.START_MONTH_DAY_IN_YEAR);

            while (day.getYear() == Calendar.this.year) {
                if ((day.getDayOfWeek() == DayOfWeek.SUNDAY)
                        || ((day.getDayOfWeek() == DayOfWeek.SATURDAY))) {
                    allDays.add(new DayOfCalendar(day, Calendar.WEEKEND_DAY));
                } else {
                    allDays.add(new DayOfCalendar(day, Calendar.WORK_DAY));
                }
                day = day.plusDays(1);
            }
        }

        private void initialWorkDay() {
            LocalDate day = LocalDate.of(Calendar.this.year,
                    Calendar.START_MONTH_DAY_IN_YEAR,
                    Calendar.START_MONTH_DAY_IN_YEAR);

            while (day.getYear() == Calendar.this.year) {

                if ((day.getDayOfWeek() != DayOfWeek.SUNDAY)
                        || ((day.getDayOfWeek() != DayOfWeek.SATURDAY))) {
                    workDay.add(new DayOfCalendar(day, Calendar.WORK_DAY));
                }
                day = day.plusDays(1);
            }
        }

        private void initialWeekend() {
            LocalDate day = LocalDate.of(Calendar.this.year,
                    Calendar.START_MONTH_DAY_IN_YEAR,
                    Calendar.START_MONTH_DAY_IN_YEAR);

            while (day.getYear() == Calendar.this.year) {

                if ((day.getDayOfWeek() == DayOfWeek.SUNDAY)
                        || ((day.getDayOfWeek() == DayOfWeek.SATURDAY))) {
                    weekends.add(new DayOfCalendar(day, Calendar.WEEKEND_DAY));
                }
                day = day.plusDays(1);
            }
        }

        private boolean addHoliday(DayOfCalendar day) {
            boolean isAdd = holidays.add(new DayOfCalendar(day.getDate(),
                    day.getDescription()));
            if (!isAdd) {
                holidays.remove(new DayOfCalendar(day.getDate(),
                        day.getDescription()));
            }
            return isAdd;
        }

        public boolean workAndRestDays() {
            boolean isAdd;
            isAdd = allDays.addAll(weekends);
            isAdd = allDays.addAll(workDay);
            if(!holidays.isEmpty()) {
                for (DayOfCalendar dayInCalendar : holidays) {
                    if(allDays.contains(dayInCalendar)) {
                        allDays.remove(dayInCalendar);
                        allDays.add(dayInCalendar);
                    }
                }
            }
            return isAdd;
        }

    }

}
