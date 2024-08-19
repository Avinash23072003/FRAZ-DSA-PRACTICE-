
import java.util.Scanner;

public class sumD {
    public static int sumofDigits(int n) {
        if (n >= 0 && n <= 9) {
            return n;
        } else {
            int ans = sumofDigits(n / 10) + n % 10;
            return ans;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumofDigits(n));

    }
}
