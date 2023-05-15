package by.ruslan.radevich.lessons14;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateMain {
    public static void main(String[] args) {
        LocalDateTime time;//дата и время
        LocalDate date; // просто день
        Date oldDate;//не используем
        Calendar calendar;

        date = LocalDate.now();
        time = LocalDateTime.now();
        System.out.println(date);
        System.out.println(time);
        System.out.println(date.plusDays(1));//завтра
        System.out.println(date.minusDays(1));//вчера
//        date.plusMonths(1)
//                .plusWeeks(1)
//                .plusYears(1);
//        time = time.plusHours(1)
//                .plusWeeks(1);
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfYear());
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        LocalDate nextDate = LocalDate.now().plusDays(1);
        System.out.println(date.isAfter(nextDate));//дата раньше или позже
        System.out.println(date.isBefore(nextDate));
        LocalDate exactDate = LocalDate.of(2020, Month.FEBRUARY,15);//овзращается к дате
        System.out.println(exactDate);
        LocalDate exactDate2 = LocalDate.of(2020,2,15);
        System.out.println(exactDate2);
        SimpleDateFormat format = new SimpleDateFormat("yyyy    MM   dd");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(format.format(new Date()));
        String stringDate = "20-03-2022";
        String secondStrongDate = "2022-03-21";
        System.out.println(LocalDate.parse(stringDate, formatter));
        System.out.println(LocalDate.parse(secondStrongDate));

    }
}
