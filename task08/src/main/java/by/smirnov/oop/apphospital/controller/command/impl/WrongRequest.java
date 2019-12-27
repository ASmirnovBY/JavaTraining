package by.smirnov.oop.apphospital.controller.command.impl;

import by.smirnov.oop.apphospital.controller.command.Command;

public class WrongRequest implements Command {
    @Override
    public String execute(String request) {
        return "Wrong request";
    }
}
