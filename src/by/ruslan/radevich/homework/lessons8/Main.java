package by.ruslan.radevich.homework.lessons8;

public class Main {
    public static void main(String[] args) {
        Phone1 phone1 = new Phone1();
        Phone2 phone2 = new Phone2();
        Phone phone = new Phone();

        System.out.println(phone);
        System.out.println(phone1);
        System.out.println(phone2);
        phone.getReceveCall();
        phone.name("Ruslan", 2223333);
        phone1.name("Ruslan");
        phone2.name("Ruslan");

    }
}
