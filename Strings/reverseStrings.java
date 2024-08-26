import java.util.Scanner;

public class reverseStrings {
    // public static String reverse(String str, int idx) {
    // if (idx == str.length()) {
    // return "";
    // }
    // String ans = reverse(str, idx + 1);
    // return ans + str.charAt(idx);

    // }
    public static boolean isPalindrome(String str, int l, int r) {
        if (l >= r) {
            return true;
        } else {
            return str.charAt(l) == str.charAt(r) && isPalindrome(str, l + 1, r - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(isPalindrome(str, 0, str.length() - 1));

        // if (ans.equals(str)) {
        // System.out.println("Palondrome");
        // } else {
        // System.out.println("Not palondrome");
        // }

    }
}
