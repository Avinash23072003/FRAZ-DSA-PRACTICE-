package Recursion;

import java.util.Scanner;

public class sumofdigits {
    public static int sumD(int n) {
        // Convert negative numbers to positive
        n = Math.abs(n);

        // Base case
        // if (n >= 0 && n <= 9) {
        // return n;
        // }

        // Recursive case
        int smallAns = sumD(n / 10) + n % 10;
        return smallAns;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Calculate sum of digits
        int result = sumD(n);

        // Print the result
        System.out.println("Sum of digits: " + result);

        // Close the scanner
        sc.close();
    }
}
