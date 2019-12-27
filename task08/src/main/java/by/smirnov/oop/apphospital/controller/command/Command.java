package by.smirnov.oop.apphospital.controller.command;

public interface Command {
    char paramDelimetr = '&';
    String execute(String request);
}
