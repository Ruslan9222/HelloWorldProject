package by.ruslan.radevich.homework.lessons13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class HomeWork {
    public static void firstTask() {
        String text1 = "The text is given, you need to read all the words entered in it, " +
                "and output them in alphabetical order";
        String[] arrayString = text1.split(" ");
        List<String> arrayString2 = new ArrayList<>();
        Collections.addAll(arrayString2,arrayString);
        for (String word: arrayString){
            arrayString2.add(word);
        }
        Collections.sort(arrayString2);
        System.out.println(Arrays.toString(arrayString));

    }

    public static void secondTask() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("file.txt"));
        HashSet<Integer> Set = new HashSet<>();
        while (scanner.hasNextInt()) {
            Set.add(scanner.nextInt());
        }
        for (int number : Set) {
            System.out.println(number);
        }
    }


    public static void thirdTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("");
        List<String> fruit;
        List<List <String>>nameFruit;
        Map<String, List<String>> myMap = new HashMap<>();
        List<String> ovo;
        List<List <String>>nameOvo;
        Map<String, List<String>> myMap2 = new HashMap<>();


    }

}

