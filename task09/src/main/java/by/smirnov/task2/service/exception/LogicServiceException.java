package by.smirnov.task2.service.exception;

public class LogicServiceException extends Exception {
    public LogicServiceException() {
    }

    public LogicServiceException(String message) {
        super(message);
    }

    public LogicServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public LogicServiceException(Throwable cause) {
        super(cause);
    }
}
