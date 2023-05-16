package by.ruslan.radevich.homework.lessons11;

public class ExceptionClass extends Exception{

    public ExceptionClass(String message) {
        super(message);

    }

    @Override
    public String toString() {
        return "ExceptionClass{" +
                "number='" + '\'' +
                "} " + super.toString();
    }
}
