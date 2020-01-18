package by.smirnov.task10.task2.utils.request;

import java.util.HashMap;
import java.util.Map;

public class Request {
    private String command;
    private Map<String, String> params;

    public Request() {
        params = new HashMap<>();
    }

    public Request(String command, Map<String, String> params) {
        this.command = command;
        this.params = params;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public void addParam(String name, String value) {
        params.put(name, value);
    }

    public String getParam(String name) {
        return params.get(name);
    }
}
