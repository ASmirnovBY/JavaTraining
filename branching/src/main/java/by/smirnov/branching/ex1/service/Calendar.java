package by.smirnov.branching.ex1.service;

import by.smirnov.branching.ex1.entity.Date;

public class Calendar {
    private Date date;
    private Month[] months;

    public Calendar(Date date) {
        this.date = date;
        months = Month.values();
    }

    public Date nextDay() {
        int day = date.getDay();
        int month = date.getMonth();
        int year = date.getYear();
        int daysInMonth;

       if (isLeap() == 1) {
            daysInMonth = Month.FEBRUARYLEEP.getDays();
        } else {
           daysInMonth = months[month - 1].getDays();
       }
       if (isLastDayInYear(date.getDay(), date.getMonth())) {
            year += 1;
            month = Month.JANUARY.getNumber();
            day = 1;
        } else if (isLastDayOnMonth(date.getDay(), daysInMonth)) {
            month += 1;
            day = 1;
        }  else {
           day += 1;
       }

        return new Date(day, month, year);
    }

    private boolean isLastDayOnMonth(int day, int allDaysMonth) {
        return (day == allDaysMonth);
    }

    private boolean isLastDayInYear(int day, int month) {
        return ((day == 31)
                && (month == Month.DECEMBER.getNumber()));
    }

    private int isLeap() {
        return date.isLeap();
    }

    public Date getDate() {
        return date;
    }

}
