public class fibonaaci {
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        else {
            int a = fib(n - 1);
            int b = fib(n - 2);
            return a + b;
        }

    }

    public static void main(String[] args) {
        int n = 1;
        System.out.println(fib(n));
    }
}
