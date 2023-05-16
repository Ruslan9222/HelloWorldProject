package by.ruslan.radevich.lessons14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FruitMain {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("banana", 10, "Yellow"));
        fruits.add(new Fruit("Apple", 20, "Red"));
        fruits.add(new Fruit("Plume", 5, "Violet"));
        fruits.add(new Fruit("banana", 10, "Yellow"));
        fruits.add(new Fruit("banana", 20, "Yellow"));

//        fruits.stream().filter(fruit -> fruit.getWeight()>10).map(fruit -> fruit.getName())
//                        .map( -> fruits.length()).collect(Collectors.toSet());
        System.out.println(filterFruits(fruits));
        System.out.println(filterFruitsByWeight(fruits));
        System.out.println(filterFruitsByName(fruits));
        Predicate<Fruit> colorPredicate = fruit -> fruit.getColor().equals("Yellow");
        Predicate<Fruit> weightPredicate = fruit -> fruit.getWeight() > 15;
        Predicate<Fruit> namePredicate = fruit -> fruit.getName().length() > 5;
        //предикат - что то доем, возвращаем true или false
        //консьюмер - что то даеь ничего не возращает
        Consumer<Fruit> myStringConsumer = s -> System.out.println(s);
        printNeededFruits(fruits, myStringConsumer);
        Consumer<Fruit> bananaConsumer = fruit -> {
            if (fruit.getName().equals("banana")){
                System.out.println(fruit);
                System.out.println("We print only banana");
            }
        };
        Consumer<Fruit> bigFruitConsumer = fruit -> {
            if (fruit.getWeight()>20){
                System.out.println("We print only big fruits");
                System.out.println(fruit);
            }
        };
        printNeededFruits(fruits, bananaConsumer);
        printNeededFruits(fruits,bigFruitConsumer);
        System.out.println(filterFruit(fruits, colorPredicate));
        System.out.println(filterFruit(fruits, weightPredicate));
        System.out.println(filterFruit(fruits, namePredicate));
        System.out.println(filterFruit(fruits, fruit -> fruit.getWeight() > 20 && fruit.getColor()
                .equals("Yellow")));


    }
    private static void printNeededFruits(List<Fruit> fruits, Consumer<Fruit>fruitConsumer){
        for (Fruit fruit: fruits){
            fruitConsumer.accept(fruit);
        }
    }

    private static List<Fruit> filterFruit(List<Fruit> fruits, Predicate<Fruit> predicate) {
        List<Fruit> result = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (predicate.test(fruit)) {
                result.add(fruit);
            }
        }
        return result;
    }

    private static List<Fruit> filterFruits(List<Fruit> fruits) {
        List<Fruit> result = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruit.getColor().equals("Yellow")) {
                result.add(fruit);
            }
        }
        return result;
    }

    private static List<Fruit> filterFruitsByWeight(List<Fruit> fruits) {
        List<Fruit> result = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruit.getWeight() > 15) {
                result.add(fruit);
            }
        }
        return result;
    }

    private static List<Fruit> filterFruitsByName(List<Fruit> fruits) {
        List<Fruit> result = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruit.getName().length() > 5) {
                result.add(fruit);
            }
        }
        return result;
    }
}
