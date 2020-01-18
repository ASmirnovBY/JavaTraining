package by.smirnov.task10.task2.controller;

public enum CommandType {
    BUILD, //work and holidays
    BUILD_WORK, //only work days
    BUILD_WEEKEND, //only weekend days
    BUILD_ALL, //calendar with holidays(from file)
    WRONG_REQUEST;
}
