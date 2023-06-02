package by.ruslan.radevich.lessons19;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private int count;
    private AtomicInteger intCount;
    private final Object lock = new Object();// для синхронизаций
    private volatile int counter;//каждый раз когда хочешь взять бери со старого


    public int getCount() {//делаем синхронизацию поток не может воити в метод пока тут есть
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    //    public synchronized void increment() throws InterruptedException {
//        setCount(getCount()+1);
//        System.out.println("egege");
//        Thread.sleep(1000);
//    }
    public synchronized void increment() throws InterruptedException {
        synchronized (lock) {
            setCount(getCount() + 1);
        }
        intCount.incrementAndGet();
        intCount.addAndGet(10);
        intCount.decrementAndGet();
        intCount.getAndIncrement();//аналоги как без лока
        System.out.println("egege");
        Thread.sleep(100);
    }
}
