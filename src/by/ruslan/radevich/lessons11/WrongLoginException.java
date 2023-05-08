package by.ruslan.radevich.lessons11;

public class WrongLoginException extends Exception {
    public WrongLoginException(String message){
        super(message);
    }

    public WrongLoginException(String message, Throwable cause) {
        super(message, cause);
    }
}
