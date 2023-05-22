package by.ruslan.radevich.homework.lessons15;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamStudentMain {
    public static void main(String[] args) {
        List<String> studentNames = Arrays.asList("Alesha", "Maxim", "Anna", "Polina", "Ruslan", "Vadim"
                , "Evgeny", "Andrey", "Sergey", "Dmitriy", "Evgeny");
        long testOne = studentNames.stream().filter("Ruslan"::equalsIgnoreCase)
                .count();
        System.out.println(testOne);

        List<String> studentNames1 = Arrays.asList("Alesha", "Maxim", "Anna", "Polina", "Ruslan", "Vadim"
                , "Evgeny", "Andrey", "Sergey", "Dmitriy", "Evgeny");
        List<String> testTwo = studentNames1.stream()
                .filter(name -> name.toLowerCase().startsWith("a"))
                .toList();
        System.out.println(testTwo);

        List<String> studentNames3 = Arrays.asList("Alesha", "Maxim", "Anna", "Polina", "Ruslan", "Vadim"
                , "Evgeny", "Andrey", "Sergey", "Dmitriy", "Evgeny");
        List<String> testTree = Collections.singletonList(studentNames3.stream()
                .findFirst().orElse("Empty"));
        System.out.println(testTree);

    }


}
