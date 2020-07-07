package chapter4;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 *
 * @author Elio Yang
 * @date 2020/5/17
 */
public class CalenderTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today - 1);
        DayOfWeek weekday = date.getDayOfWeek();
        int val = weekday.getValue();

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < val; i++) {
            System.out.print("    ");
        }

        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today) {
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }
        }
    }
}
/*
 API:LocalDate
 static LocalDate now();
 construct a object with current date

 static LocalDate of(int year,int month,int day);
 construct a object with given date

 int getYear();
 int getMonthValue();
 int getDayOfMonth();
 get current y/M/d

 DayOfWeek getDayOfWeek();
 return a instance of Class DayOfWeek,method getValue() will
 return a number from 1~7 represents Mon~Sun

 LocalDate plusDays(int n);
 LocalDate minusDays(int n);
 get a date which is n days before or after


*/