package by.ruslan.radevich.homework.lessonsThird;

import java.util.Random;
import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = input.nextInt();
        Random numbers = new Random();
        for (int i = number; i < 5; i++) ;
        System.out.println("Random numbers " + numbers.nextInt(5));


    }
}
