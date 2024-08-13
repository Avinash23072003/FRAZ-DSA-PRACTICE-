package Arrays;
import java.util.Scanner;

public class Array5 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        arr[0] = 13;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
