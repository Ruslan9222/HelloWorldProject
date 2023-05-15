package by.ruslan.radevich.homework.lessons13;

import java.io.FileNotFoundException;
import java.util.*;

public class MainClass {
    public static void main(String[] args) throws FileNotFoundException {
        String[] arr = {"First, Second, Third"};
        List<String> arrList = Arrays.asList(arr);
        List<String> nextArr = new ArrayList<>();
        nextArr.addAll(arrList);


        Map<String, List<String>> products = new HashMap<>();
        List<String> fruits = new ArrayList<>();
        //получили с консоли
        String category = "fruits";
        // products.put(category,fruits);
        products.put(category, new ArrayList<>());
        List<String> categoryProducts = products.get(category);
        if (categoryProducts == null) {
            System.out.println("No categories");
        } else {
            categoryProducts.add("Apple");
        }
        fruits.add("Apple");

        HomeWork.firstTask();
        HomeWork.secondTask();

    }
}
