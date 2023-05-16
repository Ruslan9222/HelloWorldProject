package by.ruslan.radevich.lessons14;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionExample {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("banana", 10, "Yellow"));
        fruits.add(new Fruit("Apple", 20, "Red"));
        fruits.add(new Fruit("Plume", 5, "Violet"));
        fruits.add(new Fruit("banana", 25, "Yellow"));
        fruits.add(new Fruit("banana", 20, "Yellow"));
        //Collections.sort(fruits,(o1, o2) -> o1.getName().length() - o2.getName().length());//сортировка по возрастаию
        Collections.sort(fruits, Comparator.comparingInt(o -> o.getName().length()));//другои вид записи
        System.out.println(fruits);

        Supplier<Integer> myRandomSupplier = () -> new Random().nextInt(5);//ничего не принимает но что то возращает
        System.out.println(getOneFruit(fruits, myRandomSupplier));
        System.out.println(getOneFruit(fruits, () -> 0));
        System.out.println(getOneFruit(fruits, () -> fruits.size() - 1));
        Supplier<Integer> myNotBananaSupplier = () -> getNotBananaPosition(fruits);
        System.out.println("not bananas");
        System.out.println(getOneFruit(fruits, myNotBananaSupplier));
    }

    Function<Fruit, String> getNameFunction = fruit -> fruit.getName();//приходит фрукт а возращается имя фрукта
    Function<Fruit, String> getShortNameFunction = fruit -> fruit.getName().substring(0, 2);
    Function<Fruit, String> getSizeFunction = fruit -> fruit.getWeight() < 10 ? "Small" : "Big";//аналог if/else

    private static int getNotBananaPosition(List<Fruit> fruits) {
        int position = new Random().nextInt(5);
        while (fruits.get(position).getName().equals("banana")) {
            position = new Random().nextInt(5);
        }
        return position;
    }

    private static List<String> convertFruits(List<Fruit> fruits, Function<Fruit, String> converter) {
        List<String> result = new ArrayList<>();
        for (Fruit fruit : fruits) {
            result.add(converter.apply(fruit));
        }
        return result;
    }

    private static Fruit getOneFruit(List<Fruit> fruits, Supplier<Integer> positionSupplier) {
        return fruits.get(positionSupplier.get());
    }
}
