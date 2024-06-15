package by.ruslan.radevich.homework.lessons3;

import java.util.Scanner;


public class SecondTask {
    public static void main(String[] args) {

        printRandomSum();
    }

    private static void printRandomSum() {
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String b= "wqeq";
        String c= "wqeq";
        String c1 = new String(c);

        if (number > 100) {
            System.out.println("User is not right");
        } else {
            int sum = 0;
            for (int i = 0; i < number; i++) {
                sum = sum + i;
            }
//            System.out.println(sum);
//            System.out.println(b.equals(c));
//            System.out.println(b==c);
//            System.out.println(c1==c);
//            System.out.println(c1.equals(c));

        }

    }

}



