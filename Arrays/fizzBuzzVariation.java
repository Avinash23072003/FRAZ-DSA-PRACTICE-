package Arrays;
import java.util.Scanner;

public class fizzBuzzVariation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                sum = sum + i;
                System.out.println(i);
                System.out.println("Sum is " + sum);
                if (sum > 3 * n) {
                    break;
                }
            }

        }
    }
}
