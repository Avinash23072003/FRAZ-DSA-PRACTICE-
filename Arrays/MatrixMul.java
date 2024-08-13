package Arrays;
import java.util.Scanner;
import java.lang.Math;

public class MatrixMul {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int arr1[][] = new int[a][b];
        int arr2[][] = new int[b][c];

        int ans[][] = new int[a][c];

        // print 1st array
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr1[i][j] = sc.nextInt();

            }

        }
        // print 2nd array
        for (int i = 0; i < b; i++)
            for (int j = 0; j < c; j++) {
                arr2[i][j] = sc.nextInt();
            }

        // print ans array;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < c; j++) {
                ans[i][j] = 0;
                for (int k = 0; k < b; k++) {
                    ans[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(ans[i][j] + " ");

            }
            System.out.println();
        }

    }

}
