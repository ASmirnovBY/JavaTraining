package by.smirnov.task2.controller.command.impl;

import by.smirnov.task2.controller.command.Command;

public class WrongRequest implements Command {

    @Override
    public String execute(String request){
        return "Wrong request";
    }
}
