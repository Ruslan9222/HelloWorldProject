package by.ruslan.radevich.homework.lessons11;

public class MainClass {
    public static void main(String[] args) throws ExceptionClass {
        try {
            ClassTask.firstTask();
        }catch (ExceptionClass e){
            System.out.println("ABC is not found");
        }
        try {
            ClassTask.secondTask();
        } catch (ExceptionClass e){
            System.out.println("He document does not start with the sequence 555");;
        }

        try {
            ClassTask.thirdTask();
        } catch (ExceptionClass e) {
            System.out.println("The document does not end with the sequence 1a2b");
        }
    }
}