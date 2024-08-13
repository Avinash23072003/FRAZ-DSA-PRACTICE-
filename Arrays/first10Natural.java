package Arrays;
public class first10Natural {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            int sum = 0;
            int k = 15;
            for (int j = i; j > 0; j /= 10) {
                int eachdigitsum = j % 10;
                sum = sum + eachdigitsum;
            }
            if (sum == k) {
                System.out.println(i);
            }
        }
    }
}