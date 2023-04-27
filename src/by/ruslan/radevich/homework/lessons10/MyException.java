package by.ruslan.radevich.homework.lessons10;

public class MyException extends Exception{
   public String condition;

    public MyException(String message, String condition) {
        super(message);
        this.condition = condition;
    }

}
