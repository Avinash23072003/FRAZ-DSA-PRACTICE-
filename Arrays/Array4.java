package Arrays;
import java.util.Scanner;

public class Array4 {
    public static void display(int arr[], int N) {
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int add_end(int arr[], int N, int val) {
        if (N < 100) {
            arr[N] = val;
            return N + 1;
        } else {
            return N;
        }
    }

    public static int delete_end(int arr[], int N) {
        if (N >= 1) {
            arr[N - 1] = 0;
            return N - 1;
        } else {
            return N;
        }
    }

    public static int delete_beginning(int arr[], int N) {
        if (N == 0) {
            return N;
        }

        for (int i = 0; i + 1 < N; i++) {
            arr[i] = arr[i + 1];
        }
        arr[N - 1] = 0;
        return N - 1;
    }

    public static int add_beginning(int arr[], int N, int val) {
        if (N == 0) {
            return N;
        }

        for (int i = N; i >= 1; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = val;
        return N + 1;
    }

    public static int delete_atindex(int arr[], int N, int id) {
        if (N == 0) {
            return N;
        }
        if (id < 0 || id >= N) {
            return N;
        }

        for (int i = id; i + 1 < N; i++) {
            arr[i] = arr[i + 1];
        }
        arr[N - 1] = 0;
        return N - 1;
    }

    public static int add_atindex(int arr[], int N, int id, int val) {
        if (N == 0) {
            return N;
        }
        if (id < 0 || id <= N) {
            return N;
        }

        for (int i = id; i >= id + 1; i--) {
            arr[i] = arr[i - 1];
        }
        arr[id] = val;
        return N + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int arr[] = new int[100];
        int val = sc.nextInt();
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Uncomment the following lines to test different functionalities
        // N = delete_end(arr, N);
        // N = add_end(arr, N, val);
        // N = delete_beginning(arr, N);
        // N = add_beginning(arr, N, val);
        // N = delete_atindex(arr, N, 1);
        N = add_atindex(arr, N, val, 2);
        display(arr, N);
    }
}
