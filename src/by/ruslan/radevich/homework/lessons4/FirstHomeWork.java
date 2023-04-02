package by.ruslan.radevich.homework.lessons4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FirstHomeWork {
    public static void main(String[] args) {
        SeventhTask();
    }

    private static void SeventhTask() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of months");
        int months = input.nextInt();
        System.out.println("Deposit amount");
        float deposit = input.nextFloat();
        double percent = 0.07;
        System.out.println((deposit * percent) * months + (deposit * months));

        SecondTaskLessons4();


    }

    private static void SecondTaskLessons4() {
        int[] arr = new int[5];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
            System.out.println((arr[i]=0));//Создайте массив целых чисел
            // (заполните или руками, или случайным образом).
            // Везде в массиве вместо указанного числа поставьте 0. Недоконца понимаю условие задачи
        }
    }
}
