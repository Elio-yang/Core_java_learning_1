package chapter3basicgrammar;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Elio Yang on 2020/3/30.
 */
public class LotteryDrawing_3_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("k=?");
        int k = in.nextInt();

        System.out.println("N=?");
        int n = in.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {
            int p = (int) (Math.random() * n);
            result[i] = numbers[p];
            numbers[p] = numbers[n - 1];
            n--;
        }

        Arrays.sort(result);
        for (int r : result) {
            System.out.println(r);
        }
    }
}
