
public class anypower {
    public static int pow(int p, int q) {
        // if (q == 0) {
        // return 1;
        // } else {
        // return pow(p, q - 1) * p;
        // }

        if (q == 0) {
            return 1;
        }
        if (q < 0) {
            p = 1 / p;
            q = -q;
        }

        if (q == 1) {
            return p;
        }
        int smallpow = pow(p, q / 2);
        if (q % 2 == 0) {
            return smallpow * smallpow;
        } else {
            return smallpow * smallpow * p;
        }

    }

    public static void main(String[] args) {

        System.out.println(pow(4, -3));

    }
}
