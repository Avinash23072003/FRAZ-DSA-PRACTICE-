package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr1[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr1));
        int target = sc.nextInt();
        boolean ans = false;
        for (int i = 0; i < N; i++) {

            if (arr1[i] == target) {
                ans = true;
                break;
            }

        }
        System.out.println(ans);

    }

}
