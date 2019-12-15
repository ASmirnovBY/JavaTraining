package by.smirnov.branching.ex1.controller;

import by.smirnov.branching.ex1.entity.Date;
import by.smirnov.branching.ex1.service.Calendar;
import by.smirnov.branching.ex1.service.DateBuilder;

public class Runner {
    public static void main(String[] args) {
        DateBuilder builder = DateBuilder.getBuilder();
        Date date1 = builder.createDate();
        Calendar calendar = new Calendar(date1);
        System.out.println(calendar.nextDay());
        System.out.println(calendar.getDate());

        /*Test
        Date date1 = new Date(28, 2, 2019);
        System.out.println("is leep " + date1.isLeap());
        Calendar calendar = new Calendar(date1);
        System.out.println(calendar.nextDay());
        *//*Date date1 = new Date(31, 12, 2019);
        System.out.println("is leep " + date1.isLeap());
        Calendar calendar = new Calendar(date1);
        System.out.println(calendar.nextDay());*/

    }
}
