package chapter4;

import java.util.Scanner;

/**
 *
 * @author Elio Yang
 * @date 2020/7/6
 */
public class EnumTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a size:(SMALL,MEDIUM,LARGE,EXTRA_LARGE)");
        String input=in.next().toUpperCase();
        Size size=Enum.valueOf(Size.class,input);
        System.out.println("Size="+size);
        System.out.println(size.toString());

    }
}

enum Size {
    /***
     * SMALL size:small
     * MEDIUM size:medium
     * LARGE size:large
     * EXTRA_LARGE size:extra_large
     */
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");
    private String abbreviation;

    private Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    private String getAbbreviation() {
        return this.abbreviation;
    }

    @Override
    public String toString() {
        return "Size{" +
                "abbreviation='" + this.getAbbreviation()+ '\'' +
                '}';
    }
}
