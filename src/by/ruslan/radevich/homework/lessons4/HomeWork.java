package by.ruslan.radevich.homework.lessons4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        sixthTaskLessons3();


        zeroTasklessons4();


    }

    private static void sixthTaskLessons3() {
        for (int number1 = 10; number1 < 21; number1++) {
            System.out.println(number1 * number1);
        }
    }

    private static void zeroTasklessons4() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number = input.nextInt();
        int[] arr = new int[5];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(5);
            if (arr[i] > 0) {
                System.out.println("there is such a number ");
                break;
            }
        }


        fifthTaskLessons3();
    }

    private static void fifthTaskLessons3() {
        for (int number = 0; number < 45; number += 5) {
            if (number % 2 == 0) {
                System.out.println(number);
            } else {
                System.out.println(-number);
            }
        }

    }
}
