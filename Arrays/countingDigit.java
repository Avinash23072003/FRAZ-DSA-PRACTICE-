package Arrays;
import java.util.Scanner;

public class countingDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. u want to count its digit");
        int n = sc.nextInt();
        int count = 0;
        for (int i = n; n > 0; n /= 10) {
            count++;
            System.out.println(count);

        }

    }
}
