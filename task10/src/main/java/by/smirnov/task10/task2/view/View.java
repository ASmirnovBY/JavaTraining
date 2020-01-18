package by.smirnov.task10.task2.view;

import by.smirnov.task10.task2.utils.request.Request;
import by.smirnov.task10.task2.utils.request.Response;

public interface View {
    Request buildRequest();
    void printResponse(Response response);
}
