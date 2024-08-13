package Arrays;
import java.util.Scanner;

public class faddfirstlast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(firstdigit(n) + lastdigit(n));
    }

    public static int firstdigit(int n) {
        while (n >= 10) {
            n = n / 10;
        }
        return n;
    }

    public static int lastdigit(int n) {
        int lastdigit = n % 10;
        return lastdigit;
    }
}
