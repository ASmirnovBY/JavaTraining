package by.smirnov.task2.controller;

import by.smirnov.task2.controller.command.Command;
import by.smirnov.task2.controller.command.CommandName;
import by.smirnov.task2.controller.command.impl.*;
import by.smirnov.task2.service.impl.TourCalculator;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {
    private final Map<CommandName, Command> repository = new HashMap<>();

    protected CommandProvider() {
        repository.put(CommandName.ALL, new AllTours());
        repository.put(CommandName.BY_LOW_COST, new LowCost());
        repository.put(CommandName.TYPE, new TourType());
        repository.put(CommandName.COST, new CostTour());
        repository.put(CommandName.WRONG, new WrongRequest());
    }

    protected Command getCommand(String type) {
        CommandName commandName = null;
        Command command = null;
        try {
            commandName = CommandName.valueOf(type.toUpperCase());
            command = repository.get(commandName);
        } catch (IllegalArgumentException | NullPointerException exception) {
            command = repository.get(CommandName.WRONG);
        }
        return command;
    }
}
