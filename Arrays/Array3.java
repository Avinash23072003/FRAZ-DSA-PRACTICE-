package Arrays;
import java.util.Scanner;
import java.util.Arrays;

/* 
public class Array3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));

        int min1_val = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            if (min1_val > array[i]) {
                min1_val = array[i];
            }
        }
        System.out.println(min1_val);

        int min2_val = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            if (array[i] < min2_val && array[i] != min1_val) {
                min2_val = array[i];
            }
        }
        System.out.println(min2_val);

        int large1_val = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (large1_val < array[i]) {
                large1_val = array[i];
            }
        }
        System.out.println(large1_val);
        int large2_val = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (large2_val < array[i] && array[i] != large1_val) {
                large2_val = array[i];
            }
        }
        System.out.println(large2_val);
    }


}
/* */

class Array3 {
    public static void print2largest(int arr[], int N) {
        // code here
        int large = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (large < arr[i]) {
                large = arr[i];
            }

        }
        System.out.println(large);

        int larger = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (larger < arr[i] && arr[i] != large) {
                larger = arr[i];
            }

        }
        System.out.println(larger);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        print2largest(arr, N);
    }

}
