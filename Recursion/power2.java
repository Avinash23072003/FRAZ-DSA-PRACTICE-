package Recursion;

public class power2 {

    public static void main(String[] args) {
        int n = 26;
        while (n % 2 == 0)
            n = n / 2;
        if (n == 1) {
            System.out.println(true);

        } else {
            System.out.println(false);
        }
    }
}
