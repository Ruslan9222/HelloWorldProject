package by.ruslan.radevich.homework.lessons13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class HomeWork {
    public static void firstTask() {
        String text1 = "The text is given, you need to read all the words entered in it, " +
                "and output them in alphabetical order";
        List<String> text = new ArrayList<>(Collections.singleton(text1));
        Collections.sort(text);
        System.out.println(text);

    }

    public static void secondTask() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("file.txt"));
        HashSet<Integer> set = new HashSet<>();
        while (scanner.hasNextInt()) {
            set.add(scanner.nextInt());
        }
        for (int number : set) {
            System.out.println(number);
        }
    }


    public static void thirdTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("");
    }

}

