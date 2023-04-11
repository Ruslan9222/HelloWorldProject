package by.ruslan.radevich.homework.lessons7.shapes;

public class Triangle implements Shapes{
    @Override
    public void area() {
        System.out.println("Triangle area "+"S=(a*h)/2");

    }

    @Override
    public void perimeter() {
        System.out.println("Triangle perimeter "+"P=a+b+c" );

    }


}
