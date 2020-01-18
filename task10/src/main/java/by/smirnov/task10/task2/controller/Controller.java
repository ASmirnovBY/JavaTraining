package by.smirnov.task10.task2.controller;

import by.smirnov.task10.task2.controller.command.ControllerCommand;
import by.smirnov.task10.task2.utils.request.Request;
import by.smirnov.task10.task2.utils.request.Response;

public class Controller {
    private final CommandProvider commandProvider = new CommandProvider();

    public Response executeTask(Request request) {
        String actionName = request.getCommand();
        ControllerCommand command =
                commandProvider.getCommand(actionName);
        return command.execute(request);
    }
}
