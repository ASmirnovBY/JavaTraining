package by.smirnov.task1.exception;

public class CarException extends Exception{

    public CarException() {
        super();
    }

    public CarException(String message) {
        super(message);
    }

    public CarException(String message, Throwable cause) {
        super(message, cause);
    }

    public CarException(Throwable cause) {
        super(cause);
    }
}
