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
        LocalDate newDate = newYearEve.plusDays(1000);
        var year = newDate.getYear();
        var month = newDate.getMonthValue();
        var day = newDate.getDayOfMonth();
        System.out.println("New date is " + newDate);
        System.out.println(LocalDate.of(year, month, day));

        System.out.println(LocalDate.now());
    }
}

/*

Using constructor to construct a new instance,
the constructor has the same name as this class.
To construct a instance of a Date class:
        Date today=new Date();
There are many methods for Date class.
Instances of Date class have the same character which
represent a special time point.

For LocalDate class, we don't use constructor to construct
objects, we should use static factory method which represents
constructor:
        LocalDate newDate=LocalDate.now();
        LocalDate newDateCopy=LocalDate.of(2020,5,17);
There are many methods too.
*/

