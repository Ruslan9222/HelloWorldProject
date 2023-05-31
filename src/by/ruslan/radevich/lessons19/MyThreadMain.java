package by.ruslan.radevich.lessons19;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class MyThreadMain {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start; "+ LocalDateTime.now());
        MyThread thread1 = new MyThread("first");
        MyThread thread2 = new MyThread("second");
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread1.setPriority(Thread.MIN_PRIORITY);
        System.out.println("state; "+ thread1.getState());//проверить состояние потока
        MyThread thread3 = new MyThread("third");
        thread3.setDaemon(true);//поток выключается сразу после выполнения основных потоков
        thread1.start();
        System.out.println(thread1.isAlive());
        thread2.start();
        thread2.join();//третий поток не запуститься пока не отработает поток2
        System.out.println(thread1.isAlive());
        thread3.start();
        //thread3.interrupt();//просим закрыться поток
//        new Thread(()->{
//            while (true){
//                System.out.println("hello world spam");//вечный поток
//            }
//        }).start();
        System.out.println("End; "+ LocalDateTime.now());
        System.out.println(thread1.getCount());
    }
}
