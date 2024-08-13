import java.util.Scanner;

public class string1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String ans = "Yes";
        for (int i = 0, j = str.length() - 1; i <= j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                ans = "No";
                break;
            }

        }
        System.out.println(ans);

    }
}