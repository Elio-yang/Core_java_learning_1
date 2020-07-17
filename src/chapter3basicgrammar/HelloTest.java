package chapter3basicgrammar;

/**
 * This program displays a greeting.
 *
 * @author Elio
 * @date 2020/3/30
 */
public class HelloTest {
    public static void main(String[] args) {
        String greeting = "Welcome to Core Java";
        System.out.println(greeting);
        for (int i = 0; i < greeting.length(); i++) {
            System.out.println("=");
        }
        System.out.println();
    }
}

