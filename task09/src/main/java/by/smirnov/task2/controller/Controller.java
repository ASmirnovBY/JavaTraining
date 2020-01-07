package by.smirnov.task2.controller;

import by.smirnov.task2.controller.command.Command;

public class Controller {
    private final CommandProvider commandProvider = new CommandProvider();
    public String executeTask(String request) {
        String commandName;
        Command executionCommand;
        commandName = request.substring(0, request.indexOf(Command.paramDelimetr));
        executionCommand = commandProvider.getCommand(commandName);
        String response = null;
        response = executionCommand.execute(request);
        return response;
    }
}
