package by.ruslan.radevich.homework.lessons14;

import by.ruslan.radevich.lessons14.Fruit;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class TaskMain {
    public static void thirdTask() {
        Predicate<Integer> division = number -> number % 13 == 0;
        System.out.println(division.test(29));
    }
    public static void fourthTask(){
        LocalDate date = LocalDate.now();
       // Supplier<Integer> daysForWeeks = ()-> date.getDayOfWeek();
    }
    public static void fifthTask(){
        Consumer<Integer> number1 = number -> {
            if (number>=0){
                System.out.println(number*number);
            }else {
                System.out.println("The number is negative");
            }
        };

    }
    public static void sixthTask(){
        List<String> text = new ArrayList<>();
        text.add("Make a Function that accepts a sentence and counts the number of words in it");
        Function<String, Integer> text1;
    }


}
