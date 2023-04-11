package by.ruslan.radevich.homework.lessons7.shapes;

public class MainShapes {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.area();
        triangle.perimeter();

        Circle circle = new Circle();
        circle.area();
        circle.perimeter();

        Rectangle rectangle = new Rectangle();
        rectangle.area();
        rectangle.perimeter();

        Figure figure = new Figure();
        figure.area();
        figure.perimeter();

        Shapes[] PerimeterArea = new Shapes[5];
        PerimeterArea[0] = new Triangle();
        PerimeterArea[1] = new Circle();
        PerimeterArea[2] = new Figure();
        PerimeterArea[3] = new Rectangle();
        PerimeterArea[4] = new Triangle();





    }
}

