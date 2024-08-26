
import java.util.Scanner;

public class StringBasics {

    // public static String arr(String str, char ch) {
    // String ans = "";
    // for (int i = 0; i < str.length(); i++) {

    // if (str.charAt(i) != ch) {
    // ans = ans + str.charAt(i);
    // }

    // }
    // return ans;
    // }
    public static String removeAll(String str, char ch, int idx) {
        if (idx == str.length()) {
            return "";
        }
        String smallans = removeAll(str, ch, idx + 1);
        char currchar = str.charAt(idx);
        if (currchar != ch) {
            return currchar + smallans;
        } else {
            return smallans;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = 'a';
        System.out.println(removeAll(str, ch, 0));
        // System.out.println(str.charAt(0));
        // System.out.println(str.substring(3, 6));
    }
}
