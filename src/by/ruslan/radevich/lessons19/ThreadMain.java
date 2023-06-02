package by.ruslan.radevich.lessons19;

public class ThreadMain {
    public static void main(String[] args) {
        System.out.println("Hello World");
        String name =  Thread.currentThread().getName();//узнать текущий поток
        System.out.println("Thread name: "+ name);
        Thread.currentThread().setName("My super name");
        System.out.println("Thread name: "+ Thread.currentThread().getName());//ПОМЕНЯЛИ ИМЯ
        System.out.println("is alive "+ Thread.currentThread().isAlive());//проверяем живои поток или нет
        System.out.println("is interruped  "+ Thread.currentThread().isInterrupted());//закончился или нет
        try {
            Thread.sleep(5000);//просим уснуть на 5 сек потом будет следущее деиствие
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello World2");
    }
}
