package by.smirnov.task10.task1.controller;

import by.smirnov.task10.task1.controller.command.Command;
import by.smirnov.task10.task1.utils.RequestParser;

public class Controller {
    private final FileCommandProvider provider = new FileCommandProvider();

    public String executeTask(String request) {
        String commandName;
        Command command;
        RequestParser parser = new RequestParser(request);

        commandName = parser.returnRequestCommand();
        command = provider.getCommand(commandName);

        String response;
        response = command.fileExecute(parser.returnParamRequest());

        return response;
    }
}
