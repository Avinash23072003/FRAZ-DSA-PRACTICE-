package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class reverseArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int array[] = new int[N];

        // System.out.println(Arrays.toString(array));
        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }

        /*
         * for (int i = N - 1; i >= 0; i--) {
         * System.out.print(array[i] + " ");
         * }
         */
        int i = 0;
        int j = N - 1;
        while (i < j) {

            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }

        for (int val : array) {
            System.out.print(val + " ");
        }

    }
}
