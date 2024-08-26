
public class reverse {

    public static int reverse(int x) {
        int l = 0;
        while (x > 0) {
            int c = x % 10;
            l = (0 * 10) + c;
            x = x / 10;
            System.out.print(c);
        }
        return l;
    }

    public static void main(String[] args) {
        int x = 2345;
        reverse(x);
    }
}
