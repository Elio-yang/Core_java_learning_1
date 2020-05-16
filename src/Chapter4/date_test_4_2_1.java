package Chapter4;

import java.time.LocalDate;
import java.util.Date;

/**
 * Created by Elio Yang on 2020/5/17.
 */
public class date_test_4_2_1 {
    public static void main(String[] args) {
        String s = new Date().toString();
        System.out.println(s);
        Date today = new Date();
        String str = today.toString();
        System.out.println("Today is " + str);
        LocalDate newYearEve = LocalDate.of(1999, 12, 31);
        System.out.println(newYearEve);
        LocalDate newdate = newYearEve.plusDays(1000);
        var year = newdate.getYear();
        var month = newdate.getMonthValue();
        var day = newdate.getDayOfMonth();
        System.out.println("newdate is " + newdate);
        System.out.println(LocalDate.of(year, month, day));
    }
}
