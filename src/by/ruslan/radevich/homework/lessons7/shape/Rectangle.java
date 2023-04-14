package by.ruslan.radevich.homework.lessons7.shape;

public class Rectangle implements Shape{
    @Override
    public void area() {
        System.out.println("Rectangle area "+"S=a*b");
    }

    @Override
    public void perimeter() {
        System.out.println("Rectangle perimeter "+ "P=2(a+b)");

    }
}
