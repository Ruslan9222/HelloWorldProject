package by.ruslan.radevich.homework.lessons14;

import java.time.LocalDate;
import java.util.Date;

public class DateMain {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020,8,20);
        System.out.println(date.getDayOfWeek());
        LocalDate date1 = LocalDate.now();
        System.out.println(date1.plusWeeks(1));
    }
}
