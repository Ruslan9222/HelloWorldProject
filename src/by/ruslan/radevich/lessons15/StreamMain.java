package by.ruslan.radevich.lessons15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) throws IOException {
        List<Integer> values = Arrays.asList(1, 2, 10, 50, 3, 4, 5, 5, 10);//можно добавлять
        List<Integer> val2 = List.of(1, 2, 3);//фиксированый лист
        List<Integer> emptyList = Collections.emptyList();//пустои лист
        List<Integer> singleElement = Collections.singletonList(1);//лист с одним элументом
        Stream<List<Integer>> listStream = Stream.of(values, values, val2);//обьеденяем 3 листа в поток
        Stream<Integer> valuesStrem = values.stream();//переводим из листа в поток
        Stream<Integer> valuesStrem1 = values.parallelStream();
        Stream<String> stream = Stream.of("A", "B", "C");//если сами хотим заполнить
        Stream<String> myRows = Files.lines(Paths.get("abc.doc"));//добавляем фил в поток
        //Stream<Integer>firstStream = Stream.iterate(0,n->n+1);//есконечный поток
        Stream<Integer> secondStream = Stream.generate(() -> new Random().nextInt(100));//бесконечный поток от 0 до 100

        List<Integer> result = valuesStrem//се собираем в 1 лист
                .skip(2)//выкинь первые 2 числа
                .limit(3)//оставит 3 числа первые 3
                .distinct()//выкидывает повторки
                .peek(x -> System.out.println(x))
                .sorted(getIntegerComparator())//сортирует по убыванию
                .filter(getPredicate())//оставляем только четные числа
                .map(x -> x * x)//выводим квадраты чисел
                .filter(getIntegerPredicate())//выбираем числа меньше 1000
                .collect(Collectors.toList());
//        firstStream//се собираем в 1 лист
//                .skip(2)//выкинь первые 2 числа
//                .limit(3)//оставит 3 числа первые 3
//                .distinct()//выкидывает повторки
//                .peek(x -> System.out.println(x))
//                .sorted(getIntegerComparator())//сортирует по убыванию
//                .filter(getPredicate())//оставляем только четные числа
//                .map(x -> x * x)//выводим квадраты чисел
//                .filter(getIntegerPredicate())//выбираем числа меньше 1000
//                .forEach (x-> System.out.println(x));//росто выводим и не сохраняем
        // List<Integer>secondResult = listStream.flatMap(Collection::stream)
        //System.out.println(listStream.flatMap(Collection::stream)
              //  .filter(x->x<3)
                       // .map(x->(long)x)
                        //.reduce((a,b)->a*b).isPresent(x-> System.out.println(x));
                       // .noneMatch(x->x%3==0));// точно ли нет число которе можно разделить на 3 true false
                        //.allMatch(x->x>1));//все числа больше 1

                        //.anyMatch(x->x>1));//собери все в 1 поток выкинь все менье трех и больше 1 пишет true false
                // .findAny().orElseThrow());//наиди число х меньше 3
                       // .findFirst().orElseThrow());//аиди первое число или брось ошибку
                // .min((o1, o2) -> o1.compareTo(o2)).orElseThrow());//минимальное число
                //.max((o1, o2) -> o1.compareTo(o2)).orElseThrow());
                //.count());
                //.collect(Collectors.toSet())//сохраняем неповторяющие значение
                //.toList();//все листы пихаем в один стрим
                // System.out.println("Second "+ secondResult);

                //valuesStrem.collect(Collectors.toList());//собери мне все в лист
                // List<Integer>result1 = valuesStrem.collect(Collectors.toList());
                //Set<Integer> integerSet = valuesStrem.collect(Collectors.toSet());//не выведет так как все числа мы уже достали из листа
                System.out.println(result);
        //System.out.println(integerSet);//не выведет так как все числа мы уже достали из листа



    }

    private static Predicate<Integer> getPredicate() {
        return val -> val % 2 == 0;
    }

    private static Predicate<Integer> getIntegerPredicate() {
        return x -> x < 1000;
    }

    private static Comparator<Integer> getIntegerComparator() {
        return (o1, o2) -> o2.compareTo(o1);
    }
}
