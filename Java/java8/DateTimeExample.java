package java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class DateTimeExample {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println("Today's Date : " + today);

        Month month = today.getMonth();
        DayOfWeek day = today.getDayOfWeek();

        System.out.println("Current Month : " + month);
        System.out.println("Day of Week : " + day);

        LocalDate date1 = LocalDate.of(2024,1,1);
        LocalDate date2 = LocalDate.of(2025,1,1);

        long days = ChronoUnit.DAYS.between(date1,date2);

        System.out.println("Days Between : " + days);

        System.out.println("Leap Year ? " + today.isLeapYear());
    }
}