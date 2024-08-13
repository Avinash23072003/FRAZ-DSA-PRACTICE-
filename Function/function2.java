package Function;
public class function2 {
    static int add(int x, int y) {
        int sum = x + y;
        return sum;
    }

    static int mul(int c, int d) {
        return add(c, d) * add(c, d);
    }

    public static void main(String[] args) {
        int ans = mul(2, 3);
        System.out.println(ans);
    }
}
