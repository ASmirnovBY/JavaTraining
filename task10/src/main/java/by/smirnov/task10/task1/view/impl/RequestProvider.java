package by.smirnov.task10.task1.view.impl;

import by.smirnov.task10.task1.view.command.RequestCommand;
import by.smirnov.task10.task1.view.command.RequestName;
import by.smirnov.task10.task1.view.command.impl.*;

import java.util.HashMap;
import java.util.Map;

public class RequestProvider {
    private final Map<RequestName, RequestCommand> repository = new HashMap<>();

    RequestProvider() {
        repository.put(RequestName.CREATE, new CreateRequest());
        repository.put(RequestName.DELETE, new DeleteRequest());
        repository.put(RequestName.WRONG, new WrongRequest());
        repository.put(RequestName.ADD, new AddRequest());
        repository.put(RequestName.READ, new ReadRequest());
        repository.put(RequestName.RENAME, new RenameRequest());
        repository.put(RequestName.EXIT, new ExitRequest());
    }

    RequestCommand getRequestCommand(String name) {
        RequestCommand requestCommand = null;
        RequestName requestName = null;
        try{
            requestName = RequestName.valueOf(name.toUpperCase());
            requestCommand = repository.get(requestName);
        } catch (IllegalArgumentException | NullPointerException e) {
            requestCommand = repository.get(RequestName.WRONG);
        }
        return requestCommand;
    }
}
