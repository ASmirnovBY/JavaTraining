package by.smirnov.oop.apphospital.controller;

import by.smirnov.oop.apphospital.controller.command.Command;

public class Controller {
    private final CommandProvider provider = new CommandProvider();

    public String executeTask(String request) {
        String commandName;
        Command executionCommand;
        commandName = request.substring(0, request.indexOf(Command.paramDelimetr));
        executionCommand = provider.getCommand(commandName);
        String response;
        response = executionCommand.execute(request);
        return response;
    }
}
