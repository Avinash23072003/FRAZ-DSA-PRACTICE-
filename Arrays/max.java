package Arrays;
import java.io.*;
import java.util.*;
import java.lang.Math;

public class max {

    public static int GetAnswer(int N, int M, String S, String T) {
        // Create a 2D array to store lengths of longest common subsequence
        int[][] dp = new int[N + 1][M + 1];

        // Build the dp array from bottom up
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                if (S.charAt(i - 1) == T.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // The value at dp[N][M] contains the length of LCS for S and T
        return dp[N][M];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = Integer.parseInt(scan.nextLine().trim());
        int M = Integer.parseInt(scan.nextLine().trim());
        String S = scan.nextLine();
        String T = scan.nextLine();

        int result = GetAnswer(N, M, S, T);

        System.out.println(result);

        scan.close();
    }
}
