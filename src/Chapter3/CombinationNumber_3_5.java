package Chapter3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Elio Yang on 2020/3/31.
 */
public class CombinationNumber_3_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many levels?");

        int n = in.nextInt();
        int[][] dp = new int[n][];
        for (int i = 0; i < n; i++) {
            dp[i] = new int[i + 1];
        }

        for (int i = 0; i < n; i++) {
            dp[i][i] = dp[i][0] = 1;
            for (int j = 1; j < i; j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }

        for (int[] a : dp) {
            System.out.println(Arrays.toString(a));
        }
    }
}
