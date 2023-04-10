package by.ruslan.radevich.lessons7;

public interface Flyable {
    void fly();
    void flyWithSound();
    default void printMessage(){
        System.out.println("this is non informative message");
    }
}
