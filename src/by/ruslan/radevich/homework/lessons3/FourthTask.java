package by.ruslan.radevich.homework.lessons3;

import java.util.Random;
import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = input.nextInt();
        while (number < 3) {
            number += input.nextInt();
        }
        Random numbers = new Random();
        System.out.println("Random numbers " + numbers.nextInt(5));


    }
}
