class kmultiples {

    public static void multiples(int n, int k) {

        if (k == 0) {
            // System.out.println(n);
            return;
        }

        else {
            multiples(n, k - 1);
            System.out.println(n * k);

        }
    }

    public static void main(String args[]) {
        int n = 4;
        int k = 4;
        multiples(n, k);

    }
}
