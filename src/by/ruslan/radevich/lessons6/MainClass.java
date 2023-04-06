package by.ruslan.radevich.lessons6;

public class MainClass {
    public static void main(String[] args) {
//        Car myBmw = new Car();//конструктор
//        myBmw.color = "Green";
//        myBmw.age = 2023;
//        myBmw.brand = "bmw";
//        System.out.println(myBmw.color);
//        System.out.println(myBmw.age);
//        System.out.println(myBmw.wheelNumber);
//        System.out.println();
        Car mybestBMW = new Car("blue",2023,"bmw",4,true,"Auto");
        System.out.println(mybestBMW.getColor());
        mybestBMW.setColor("black-metal");
        System.out.println(mybestBMW.getColor());
        System.out.println(mybestBMW);


        mybestBMW.startDriving();
        mybestBMW.changespeed(10);
        mybestBMW.goDirectly();
        mybestBMW.changespeed(50);
        mybestBMW.changespeed(-30);
        mybestBMW.switchDirection(true);
        mybestBMW.goDirectly();
        mybestBMW.changespeed(30);
        mybestBMW.switchDirection(false);
        mybestBMW.sound();
        mybestBMW.changespeed(-60);

    }
    private static void sum(int random,int ...numbers){// посути массив
        int sum = 0;
        for (int val: numbers){
            sum+=val;
        }
        System.out.println("Sum sum: " + sum);
    }
}
