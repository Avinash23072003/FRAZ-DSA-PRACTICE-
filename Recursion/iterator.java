public class iterator {
    public static int GCD(int x, int y) {
        while (x % y != 0) {
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;

    }

    public static int IGCD(int x, int y) {

        if (y == 0) {
            return x;
        } else {
            return IGCD(y, x % y);
        }
    }

    public static void main(String[] args) {
        int x = 13;
        int y = 24;
        System.out.println(GCD(x, y));
        System.out.println(IGCD(x, y));
    }
}
