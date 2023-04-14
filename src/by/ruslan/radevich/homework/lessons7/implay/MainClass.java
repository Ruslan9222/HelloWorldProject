package by.ruslan.radevich.homework.lessons7.implay;

public class MainClass {
    public static void main(String[] args) {
        Director director = new Director();
        director.staffComposition();
        Accountant accountant = new Accountant();
        accountant.staffComposition();
        Worker worker = new Worker();
        worker.staffComposition();

    }
}
