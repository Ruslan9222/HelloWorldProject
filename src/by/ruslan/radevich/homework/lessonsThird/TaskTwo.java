package by.ruslan.radevich.homework.lessonsThird;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = input.nextInt();
        for (int a = 1, b = 0; a + b <= number; b++) {
            System.out.println(a + b);
        }
        if (number > 100){
                System.out.println("User is not right");
            }
        }
    }


