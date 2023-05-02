package by.ruslan.radevich.homework.lessons11;

public class ExceptionClass extends Exception{
    private String number;


    public ExceptionClass(String message, String number) {
        super(message);
        this.number = number;
    }

    @Override
    public String toString() {
        return "ExceptionClass{" +
                "number='" + number + '\'' +
                "} " + super.toString();
    }
}
