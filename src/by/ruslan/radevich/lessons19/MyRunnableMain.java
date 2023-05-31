package by.ruslan.radevich.lessons19;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyRunnableMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyRunnable myRunnable = new MyRunnable(new Counter());
        Thread thread = new Thread(myRunnable);
        thread.start();
        new Thread(()-> System.out.println("Hello, world")).start();

        MyCallble callble = new MyCallble();
        ExecutorService executorService = Executors.newFixedThreadPool(10);//делаем 10 потоков
        Future<String>result = executorService.submit(callble);
        System.out.println("here");
        System.out.println("result; "+ result.get());
    }
}
