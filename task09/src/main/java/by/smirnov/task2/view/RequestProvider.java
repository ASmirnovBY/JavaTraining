package by.smirnov.task2.view;

import by.smirnov.task2.view.command.*;

import java.util.HashMap;
import java.util.Map;

public class RequestProvider {
    private final Map<RequestType, RequestCommand> repository = new HashMap<>();

    RequestProvider() {
        repository.put(RequestType.ALL, new AllTours());
        repository.put(RequestType.BY_LOW_COST, new LoweCost());
        repository.put(RequestType.TYPE, new FindByType());
        repository.put(RequestType.COST, new CalculateTour());
        repository.put(RequestType.WRONG, new WrongRequest());
        repository.put(RequestType.EXIT, new Exit());
    }

    RequestCommand getRequestCommand(String type) {
        RequestCommand requestCommand = null;
        RequestType requestType = null;
        try{
            requestType = RequestType.valueOf(type.toUpperCase());
            requestCommand = repository.get(requestType);
        } catch (IllegalArgumentException | NullPointerException e) {
            requestCommand = repository.get(RequestType.WRONG);
        }
        return requestCommand;
    }

}
