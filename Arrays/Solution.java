package Arrays;

import java.util.*;

class Solution {

    public static int getMaxLength(int N, int M, String S, String T) {
        if (M > N)
            return 0; // If T is longer than S, T cannot be a substring of any subsequence K

        // Find all start indices of T in S
        List<Integer> startIndices = new ArrayList<>();
        for (int i = 0; i <= N - M; i++) {
            int j = i;
            int k = 0;
            while (j < N && k < M) {
                if (S.charAt(j) == T.charAt(k)) {
                    k++;
                }
                j++;
            }
            if (k == M) {
                startIndices.add(i);
            }
        }

        if (startIndices.isEmpty()) {
            return 0; // T cannot be placed as a substring of any subsequence K
        }

        // Calculate the maximum length of K
        int maxLength = 0;
        for (int start : startIndices) {
            int end = start + M - 1;
            int leftLength = start;
            int rightLength = N - (end + 1);
            maxLength = Math.max(maxLength, leftLength + M + rightLength);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = Integer.parseInt(scan.nextLine().trim());
        int M = Integer.parseInt(scan.nextLine().trim());
        String S = scan.nextLine();
        String T = scan.nextLine();

        int result = getMaxLength(N, M, S, T);

        System.out.println(result);

        scan.close();
    }
}
