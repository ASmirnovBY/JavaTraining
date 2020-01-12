package by.smirnov.task10.task1.controller;

import by.smirnov.task10.task1.controller.command.Command;
import by.smirnov.task10.task1.controller.command.CommandName;
import by.smirnov.task10.task1.controller.command.impl.*;

import java.util.HashMap;
import java.util.Map;

public class FileCommandProvider {
    private final Map<CommandName, Command> repository = new HashMap<>();

    FileCommandProvider() {
        repository.put(CommandName.CREATE, new CreateCommand());
        repository.put(CommandName.DELETE, new DeleteCommand());
        repository.put(CommandName.READ, new ReadCommand());
        repository.put(CommandName.ADD, new AddCommand());
        repository.put(CommandName.RENAME, new RenameCommand());
        repository.put(CommandName.WRONG, new WrongCommand());
    }

    Command getCommand(String name) {
        CommandName commandName = null;
        Command command = null;
        try {
            commandName = CommandName.valueOf(name.toUpperCase());
            command = repository.get(commandName);
        } catch (IllegalArgumentException | NullPointerException e) {
            command = repository.get(CommandName.WRONG);
        }
        return command;
    }
}
