package by.ruslan.radevich.homework.lessons8;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone(5555555,"Samsung",250);
        Phone phone1 = new Phone(4444444,"MI",240);
        Phone phone2 = new Phone(3333333,"Iphone",245);

        phone.message(5556666,"dad");
        System.out.println(phone);
        System.out.println(phone1);
        System.out.println(phone2);
        phone.name("Ruslan", 2223333);
        phone1.name("Vasya",1233332);
        phone2.name("Max",1222222);

    }
}
