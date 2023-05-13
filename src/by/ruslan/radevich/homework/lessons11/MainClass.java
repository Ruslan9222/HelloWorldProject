package by.ruslan.radevich.homework.lessons11;

public class MainClass {
    public static void main(String[] args) throws ExceptionClass {
        try {
            ClassTask.firstTask();
        }catch (ExceptionClass e){
            System.out.println(e.getMessage());
        }
        try {
            ClassTask.secondTask();
        } catch (ExceptionClass e){
            System.out.println(e.getMessage());;
        }

        try {
            ClassTask.thirdTask();
        } catch (ExceptionClass e) {
            System.out.println(e.getMessage());
        }
    }
}