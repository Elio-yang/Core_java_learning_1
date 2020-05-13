package Chapter3;

/**
 * This program displays a greeting.
 * Created by Elio on 2020/3/30.
 */
public class helloTest_2_1 {
    public static void main(String[] args) {
        String greeting="Welcome to Core Java";
        System.out.println(greeting);
        for(int i=0;i<greeting.length();i++){
            System.out.println("=");
        }
        System.out.println();
    }
}
