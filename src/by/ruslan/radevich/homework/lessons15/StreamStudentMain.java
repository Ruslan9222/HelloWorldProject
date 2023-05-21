package by.ruslan.radevich.homework.lessons15;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamStudentMain {
    public static void main(String[] args) {
        List<String> studentName = Arrays.asList("Alesha", "Maxim", "Anna", "Polina", "Ruslan", "Vadim"
                , "Evgeny", "Andrey", "Sergey", "Dmitriy", "Evgeny");
        long testOne = studentName.stream().filter("Ruslan"::equalsIgnoreCase)
                .count();
        System.out.println(testOne);

        List<String> studentName1 = Arrays.asList("Alesha", "Maxim", "Anna", "Polina", "Ruslan", "Vadim"
                , "Evgeny", "Andrey", "Sergey", "Dmitriy", "Evgeny");
        List<String> testTwo = studentName1.stream()
                .filter(name -> name.toLowerCase().startsWith("a"))
                .toList();
        System.out.println(testTwo);

        List<String> studentName3 = Arrays.asList("Alesha", "Maxim", "Anna", "Polina", "Ruslan", "Vadim"
                , "Evgeny", "Andrey", "Sergey", "Dmitriy", "Evgeny");
        List<String> testTree = Collections.singletonList(studentName3.stream()
                .findFirst().orElse("Empty"));
        System.out.println(testTree);

    }


}
