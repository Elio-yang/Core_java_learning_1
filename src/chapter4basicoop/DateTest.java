package chapter4basicoop;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Elio Yang
 * @date 2020/5/17
 */
public class DateTest {
    public static void main(String[] args) {
        String s = new Date().toString();
        System.out.println(s);
        Date today = new Date();
        String str = today.toString();
        System.out.println("Today is " + str);

        LocalDate newYearEve = LocalDate.of(1999, 12, 31);
        System.out.println(newYearEve);
        LocalDate newDate = newYearEve.plusDays(1000);
        int year = newDate.getYear();
        int month = newDate.getMonthValue();
        int day = newDate.getDayOfMonth();
        System.out.println("New date is " + newDate);
        System.out.println(LocalDate.of(year, month, day));

        System.out.println(LocalDate.now());
    }
}