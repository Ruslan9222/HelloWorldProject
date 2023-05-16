package by.ruslan.radevich.lessons11;

public class WrongPasswordException extends Exception {
    public WrongPasswordException(String message){
        super(message);
    }

    public WrongPasswordException(String message, Throwable cause) {
        super(message, cause);
    }
}
