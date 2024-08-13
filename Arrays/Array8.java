package Arrays;
import java.util.Scanner;

public class Array8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[][] = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            {
                int j = i;
                System.out.print(arr[i][j] + " ");
            }

        }
        System.out.println();
        for (int i = 0, j = N - 1; i < N; i++, j--) {

            System.out.print(arr[i][j] + " ");

        }
        System.out.println();
        matrixSwapp(arr);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
    }

    public static void matrixSwapp(int arr[][]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int temp = arr[i][i];
            arr[i][i] = arr[i][n - i - 1];
            arr[i][n - i - 1] = temp;
        }
        System.out.println();

    }
}
