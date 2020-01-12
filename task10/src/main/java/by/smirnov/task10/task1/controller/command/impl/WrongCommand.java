package by.smirnov.task10.task1.controller.command.impl;

import by.smirnov.task10.task1.controller.command.Command;

public class WrongCommand implements Command {

    @Override
    public String fileExecute(String request) {
        return "Wrong request";
    }
}
