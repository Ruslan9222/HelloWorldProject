package by.ruslan.radevich.homework.lessons19;


public class MyThread extends Thread {
    String name;

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("My best thread "+ getName());
    }
}