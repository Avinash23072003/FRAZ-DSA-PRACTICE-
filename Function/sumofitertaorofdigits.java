package Function;

public class sumofitertaorofdigits {
    public static void main(String[] args) {
        int L = 2134;
        int R = 2139;

        for (int N = L; N <= R; N++) {
            int sum = 0;
            for (int num = N; num > 0; num /= 10) {
                int eachdigit = num % 10;
                sum = sum + eachdigit;
            }
            System.out.println(sum);
        }

    }

}
