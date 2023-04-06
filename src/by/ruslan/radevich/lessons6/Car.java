package by.ruslan.radevich.lessons6;

public class Car {
    private String color;//индификаторы доступа
    private int age;
    private String brand;
    private int wheelNumber = 4;    //так задается по умолчанию
    private boolean isRadioPresent = true;
    String korobka = "Auto";
    {
        age = 2022;// инициализация переменнои не в методе(блок инициализаций)
    }
    private int currentSpeed = 0;
    //fixme для правки

    public Car(String color, int age, String brand, int wheelNumber, boolean isRadioPresent, String korobka) {
        this.color = color;
        this.age = age;
        this.brand = brand;
        this.wheelNumber = wheelNumber;
        this.isRadioPresent = isRadioPresent;
        this.korobka = korobka;
    }

    @Override
    public String toString() {
        return "This is my best car - lookat it: {" +
                "color='" + color + '\'' +
                ", age=" + age +
                ", brand='" + brand + '\'' +
                ", wheelNumber=" + wheelNumber +
                ", isRadioPresent=" + isRadioPresent +
                ", korobka='" + korobka + '\'' +
                '}';
    }

    public Car() {

    }

    public Car(String color, int age, String brand) {
        this.color = color;
        this.age = age;
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

//    public int getAge() {
//        return age;
//    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWheelNumber() {
        return wheelNumber;
    }

    public void setWheelNumber(int wheelNumber) {
        this.wheelNumber = wheelNumber;
    }

    public boolean isRadioPresent() {
        return isRadioPresent;
    }

    public void setRadioPresent(boolean radioPresent) {
        isRadioPresent = radioPresent;
    }

    public String getKorobka() {
        return korobka;
    }

    public void setKorobka(String korobka) {
        this.korobka = korobka;
    }



    public void startDriving() {
        System.out.println("woof-beep!!!");
    }

    public void sound() {
        System.out.println("beep -beep");
    }

    public void goDirectly() {
        System.out.println("my car is going!!!");
    }

    public void switchDirection(boolean isRightOne) {
        if (currentSpeed > 30) {
            System.out.println("it is too dangerous to switch direction");
            return;
        }
        if (isRightOne) {
            System.out.println("we are to right direction");
        } else {
            System.out.println("we are to left direction");
        }
    }

    public void changespeed(int speedChange) {
        currentSpeed = currentSpeed + speedChange;
        if (speedChange > 0) {
            System.out.println("we are moving faster, our speed is " + currentSpeed);
        } else {
            System.out.println("we are moving to slowly, our speed is " + currentSpeed);
        }
        if (currentSpeed <= 0) {
            System.out.println("we finished our trip!");
        }
    }

    //признаки
    //цвет,год,марка,количество колес,двигатель,кузов,есть ли магнитола,КПП

    //деиствия/методы
    //завестись, подать сигнал,поехать вперед,повернуть(влево/вправо), ускориться, замедлится
}
