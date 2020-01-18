package by.smirnov.task10.task2.controller;

import by.smirnov.task10.task1.view.command.RequestCommand;
import by.smirnov.task10.task2.controller.command.ControllerCommand;
import by.smirnov.task10.task2.controller.command.impl.*;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {
    private final Map<CommandType, ControllerCommand> repository = new HashMap<>();

    CommandProvider() {
        repository.put(CommandType.BUILD, new BuildCalendar());
        repository.put(CommandType.BUILD_WORK, new WorkDayCalendar());
        repository.put(CommandType.BUILD_WEEKEND, new WeekendDayCalendar());
        repository.put(CommandType.BUILD_ALL, new BuildWorkRestCalendar());
        repository.put(CommandType.WRONG_REQUEST, new WrongRequest());
    }

    ControllerCommand getCommand(String type) {
        CommandType commandType = null;
        ControllerCommand command = null;
        try {
            commandType = CommandType.valueOf(type.toUpperCase());
            command = repository.get(commandType);
        } catch (IllegalArgumentException
                | NullPointerException e) {
            command = repository.get(CommandType.WRONG_REQUEST);
        }
        return command;
    }
}
