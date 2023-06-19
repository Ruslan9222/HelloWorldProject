package by.ruslan.radevich.homework.lessons16;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreaMain {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(new Book("Petya","WorldOfTanks",2011),
                new Book("Petya","WorldOfWarships",2015),
                new Book("DmitryZlatopolsky","1400 Tasks of Programming",2020),
                new Book("Igor Blinov","Java from Epam",2020),
                new Book("Kathy Siera","Head First Java",2012));
        Map<Integer, List<Book>> BooksByAge = books.stream()
                .collect(Collectors.groupingBy(Book::getYearOfPublication));
        System.out.println(BooksByAge);
        var publicationYears = books.stream()
                .collect(Collectors.groupingBy(Book::getYearOfPublication));

    }
}
