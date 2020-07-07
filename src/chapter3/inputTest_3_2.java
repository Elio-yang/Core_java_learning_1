package chapter3;

import java.util.Scanner;

/**
 * Created by Elio Yang on 2020/3/30.
 */
public class inputTest_3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //test demo of scanner
        System.out.println("What is your name?");
        String name = in.nextLine();
        System.out.println("How old are you?");
        int age = in.nextInt();
        System.out.println("Hello " + name + ",next year you'll be " + (age + 1));


    }
}
