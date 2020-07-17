package chapter3basicgrammar;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Elio Yang
 * @date 2020/3/30
 */
public class BigIntegerTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers you need to draw?");
        int k = in.nextInt();
        System.out.println("What is the highest number?");
        int n = in.nextInt();
        BigInteger lotteryOdds;
        lotteryOdds = BigInteger.ONE;
        //when doing calculus of BigInteger there are special ways.
        for (int i = 1; i <= k; i++){
            lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - i + 1)).divide(BigInteger.valueOf(i));
        }
        System.out.println("Your odds are 1 in " + lotteryOdds + ".Good Luck!");
    }
}
