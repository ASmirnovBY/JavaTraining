package by.smirnov.task10.task2.controller.command.impl;

import by.smirnov.task10.task2.controller.command.ControllerCommand;
import by.smirnov.task10.task2.entity.Calendar;
import by.smirnov.task10.task2.utils.request.Request;
import by.smirnov.task10.task2.utils.request.Response;
import by.smirnov.task10.task2.utils.request.ResponseMessage;

public class WrongRequest implements ControllerCommand {

    @Override
    public Response execute(Request request) {
        return new Response(ResponseMessage.BAD_REQUEST.getMessage());
    }
}
