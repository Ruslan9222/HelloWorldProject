package by.ruslan.radevich.homework.lessons15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> test1 = Arrays.asList(10, 50, 5, 4, 6, 6, 4, 8, 10, 33);
        List<Integer> result = test1.stream().distinct().toList();
        System.out.println(result);

        List<Integer> test2 = Arrays.asList(10, 50, 5, 4, 6, 6, 4, 8, 10, 33);
        List<Integer> result2 = test2.stream()
                .filter(x -> x % 2 == 0)
                .filter(x -> x <= 17)
                .filter(x -> x >= 7)
                .toList();
        System.out.println(result2);
        List<Integer>test3 = Arrays.asList(10,50,5,4,6,6,4,8,10,33);
        List<Integer>result3 =test3.stream()
                .map(x->x*2)
                .toList();
        System.out.println(result3);
        List<Integer>test4 = Arrays.asList(10,50,5,4,6,6,4,8,10,33);
        List<Integer>result4 = test4.stream()
                .sorted((o1, o2) -> o1.compareTo(o2))
                .limit(4)
                .toList();
        System.out.println(result4);

        System.out.println(IntStream.of(10,50,5,4,6,6,4,8,10,33).summaryStatistics());
    }
}
