package Recursion;

class power {
    public static double myPow(double x, long n) {

        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        if (n == 1) {
            return x;
        }
        double temp = myPow(x, n / 2);
        if (n % 2 == 0) {
            return temp * temp;
        } else {
            return temp * temp * x;
        }
    }

    public static void main(String[] args) {
        int x = 3;
        int n = 3;
        System.out.println(myPow(x, n));
    }
}