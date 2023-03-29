package by.ruslan.radevich.homework.lessonst.hird;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {

        printRandomSum();
        printMyName();
    }

    private static void printRandomSum() {
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum = 0;
        for (int i = 0; i <number; i++){
            sum= sum+number;//сумма 10 случаиных чисе
        }
        System.out.println(sum);
        if (number > 100){
                System.out.println("User is not right");
            }
    }

    private static void printMyName() {
        System.out.println("what is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("");
    }
}


