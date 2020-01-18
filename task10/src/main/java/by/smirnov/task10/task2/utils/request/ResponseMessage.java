package by.smirnov.task10.task2.utils.request;

public enum ResponseMessage {
    OK("OK"),
    INCORRECT_INPUT_YEAR("Invalid year, year must be 2019-2056"),
    BAD_REQUEST("Incorrect request, try again"),
    INVALID_COUNTRY("Incorrect country, must be belarus, russia"),
    DB("File not found or destroy"),
    BAD_FILE("Incorrect date in file");


    private String message;

    ResponseMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
