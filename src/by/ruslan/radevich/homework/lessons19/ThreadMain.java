package by.ruslan.radevich.homework.lessons19;

public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread("First");
        MyThread t2 = new MyThread("Second");
        MyThread t3 = new MyThread("Third");
        t3.start();
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t1.join();
        //t3.start();


    }

}
