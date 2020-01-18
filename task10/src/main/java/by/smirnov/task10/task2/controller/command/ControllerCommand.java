package by.smirnov.task10.task2.controller.command;

import by.smirnov.task10.task2.utils.request.Request;
import by.smirnov.task10.task2.utils.request.Response;

public interface ControllerCommand {
    Response execute(Request request);
}
