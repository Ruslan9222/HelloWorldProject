package by.ruslan.radevich.homework.lessons7.shape;

public class Triangle implements Shape{
    @Override
    public void area() {
        System.out.println("Triangle area "+"S=(a*h)/2");

    }

    @Override
    public void perimeter() {
        System.out.println("Triangle perimeter "+"P=a+b+c" );

    }


}
