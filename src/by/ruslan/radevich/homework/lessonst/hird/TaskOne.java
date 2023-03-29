package by.ruslan.radevich.homework.lessonst.hird;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number color");
        int number = input.nextInt();
        switch (number) {
            case 1:
                System.out.println("Red");
                break;
            case 2:
                System.out.println("Orange");
                break;
            case 3:
                System.out.println("Yellow");
                break;
            case 4:
                System.out.println("Green");
                break;
            case 5:
                System.out.println("Blue");
                break;
            case 6:
                System.out.println("Indigo");
                break;
            case 7:
                System.out.println("Violet");
                break;
            default:
                System.out.println("This is not color number");
        }

    }
}