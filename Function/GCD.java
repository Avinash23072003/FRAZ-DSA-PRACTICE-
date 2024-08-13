package Function;
public class GCD {
    public static void main(String args[]) {
        int a = 40;
        int b = 90;
        int result = Math.min(a, b);
        while (result >= 0) {
            if (a % result == 0 && b % result == 0) {
                break;

            }
            result--;
        }
        System.out.println(result);

    }
}
