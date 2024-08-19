
public class sumseries {
    public static int series(int n) {
        if (n == 0) {
            return 0;
        } else {
            return series(n - 1) + n;
        }

    }

    public static int alternateSum(int n) {
        if (n == 0) {
            return 0;
        } else if (n % 2 == 0) {
            return alternateSum(n - 1) - n;
        } else {
            return alternateSum(n - 1) + n;
        }
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(series(n));
        System.out.println(alternateSum(n));
    }
}
