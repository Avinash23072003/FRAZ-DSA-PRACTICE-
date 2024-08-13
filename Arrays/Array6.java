package Arrays;
import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        System.out.println("Print array first");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int start = 0; start < N; start++) {
            for (int en = start; en < N; en++) {
                for (int i = start; i <= en; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }

    }
}