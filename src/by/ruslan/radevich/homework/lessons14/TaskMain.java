package by.ruslan.radevich.homework.lessons14;

import by.ruslan.radevich.lessons14.Fruit;

import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TaskMain {
    public static void thirdTask() {
        Predicate<Integer> division = number -> number % 13 == 0;
        System.out.println(division.test(29));
    }
    public static void fourthTask(){
        LocalDate date = LocalDate.now();
        Supplier<Integer> daysForWeeks = ()-> date.getDayOfWeek();
    }
    public static void fifthTask(){
        Consumer<Integer> number1 = number -> {
            if (number*number>=0){
                System.out.println(number);
            }else {
                System.out.println("The number is negative");
            }
        };
        System.out.println();
    }


}
