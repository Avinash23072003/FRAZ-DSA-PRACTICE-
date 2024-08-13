public class Recursion {
    public static int printn(int n) {
        if (n == 0) {
            return 1; // Base case: returns 0 when n is 0
        } else {
            System.out.println(n); // Print the current value of n
            return printn(n - 1); // Recursive call with n-1
        }
    }

    public static void main(String[] args) {
        int n = 20;
        printn(n); // Call the recursive function

    }
}
