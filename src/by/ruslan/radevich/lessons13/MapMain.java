package by.ruslan.radevich.lessons13;

import java.util.*;

public class MapMain {
    public static void main(String[] args) {
        Map<Integer, String> firstMap = new HashMap<>();//можно наити быстро по ключу
        Map<Integer, String> secondMap = new TreeMap<>();//делает ключи по возрастанию
        firstMap.put(1, "Red");
        firstMap.put(2, "Orange");
        firstMap.put(3, "Yellow");
        firstMap.put(1, "next");//так можно заменить
        System.out.println(firstMap.get(2));
        System.out.println(firstMap.get(4));
        secondMap.put(1, "Red");
        secondMap.put(2, "Orange");
        secondMap.put(3, "Yellow");
        System.out.println(firstMap.containsKey(3));//спрашиваем есть ли такое значение
        System.out.println(firstMap.isEmpty());//пустая или нет
        System.out.println(firstMap.size());//сколько ключеи!! не значений
        //System.out.println(firstMap.remove(3));//удали мне ключ и пишет что мы удалили
        System.out.println(firstMap.keySet());//даи мне все ключи которые есть отсортированы TreeMap или нет HashMap
        System.out.println(firstMap.values());//дает все обьекты ключеи
        System.out.println(firstMap);

        for (Integer key : firstMap.keySet()) {
            System.out.println(firstMap.get(key));//красиво выводим элементы
        }
        firstMap.forEach((k, v) -> System.out.println(k + " " + v));//красиво выводим элементы

        List<Integer> integers;
        List<List<Integer>> integers2;
        Map<String, List<String>> myMap = new HashMap<>();
        //computers(Lenovo,Asus)
        //phone(samsung,apple)
        List<String> computers = new ArrayList<>();
        computers.add("lenovo");
        List<String> phone = new ArrayList<>();
        phone.add("Samsung");
        myMap.put("computers", computers);
        myMap.put("phones", phone);
        phone.add("Iphone");


    }
}
