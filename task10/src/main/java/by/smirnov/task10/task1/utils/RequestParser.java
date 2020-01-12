package by.smirnov.task10.task1.utils;

public class RequestParser {
    private static final String paramDelimetr = "&";

    private String request;
    private String[] requestParam;

    public RequestParser(String request) {
        this.request = request;
        requestParam = request.split(paramDelimetr);
    }

    public String returnRequestCommand() {
        return requestParam[0];
    }

    public String returnParamRequest() {
        String param = "";
        for (int i = 1; i < requestParam.length; i++) {
            param += requestParam[i] + paramDelimetr;
        }
        return param;
    }
}
