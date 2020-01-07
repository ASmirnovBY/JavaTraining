package by.smirnov.task2.controller.command;

public interface Command {
    char paramDelimetr = '&';
    String execute(String request);
}
