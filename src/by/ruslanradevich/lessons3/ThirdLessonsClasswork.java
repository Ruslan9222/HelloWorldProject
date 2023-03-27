package by.ruslanradevich.lessons3;

import java.util.Scanner;

public class ThirdLessonsClasswork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: "); //просит ввести!! надо писать перед каждым сканером
////        int muParm = scanner.nextInt(); //nextLine() вводит пока не нажмем Enter
////        // String username = scanner.next(); просит 1 слово
////        if (muParm > 5) {
////            System.out.println("my param is greater than 5!");
//////            if (muParm > 100) {
//////                System.out.println("it so too much");
//////            }
////        } else if (muParm > 3) {
////            System.out.println("my param is greater than 3!");
////        } else {
////            System.out.println("my param is not greater than 3!");
////        }
//        System.out.println("Enter temerature");
//        int temperature = scanner.nextInt();
//        if (temperature >= 20) {
//            System.out.println("temerature is hot");
//        } else if (temperature >= 5) {
//            System.out.println("temperature is warm");
//        } else if (temperature == 5) {
//            System.out.println("temperature is cool");
//        }
//        String result = (temperature >= 20) ? "hot"
//                : (temperature >= 5) ? "warm" : "cool";// теринарный апперратор упрощенная форма if-else
//        System.out.println(result);11
        int month = scanner.nextInt();
        switch (month){ //когда известно количество
            case 12: case 1: case 2:
                System.out.println("this is winter");
                break;
            case 3: case 4: case 5:
                System.out.println("this is spring");
                break;
            case 6: case 7: case 8:
                System.out.println("this is summer");
                break;
                case 9: case 10: case 11:
                System.out.println("this is autumn");
                break;
            default:
                System.out.println("this is not month number");
        }
    }
}





