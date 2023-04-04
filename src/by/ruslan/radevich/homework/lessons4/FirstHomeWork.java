package by.ruslan.radevich.homework.lessons4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FirstHomeWork {
    public static void main(String[] args) {
        seventhTask();
    }

    private static void seventhTask() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of months");
        int months = input.nextInt();
        System.out.println("Deposit amount");
        float deposit = input.nextFloat();
        double percent = 0.07;
        System.out.println((deposit * percent) * months + (deposit * months));

        secondTaskLessons4();


    }

    private static void secondTaskLessons4() {
        int[] arr = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number = input.nextInt();
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(5);
            System.out.println(Arrays.toString(arr));
            if (arr[i] == number) {
                System.out.println(arr[i] = 0);
            }
        }


        Scanner input1 = new Scanner(System.in);
        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;
        float average = 0;
        System.out.println("Enter the size of the array");
        int n = input1.nextInt();
        int[] arr2 = new int[n];
        Random random1 = new Random();
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = random1.nextInt(10);
            if (arr2[i] > minValue) {
                minValue = arr2[i];
                System.out.println("minValue " + minValue);
            }
            if (arr2[i] < maxValue) {
                maxValue = arr2[i];
                System.out.println("maxValue " + maxValue);
            }//здесь задача не доделана

        }
    }
}