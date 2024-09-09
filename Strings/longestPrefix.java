import java.util.Arrays;

public class longestPrefix {
    public static String longprefix(String[] str) {

        int n = str.length;
        Arrays.sort(str);
        String str1 = str[0];
        String str2 = str[n - 1];
        int i;
        for (i = 0; i < n; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                break;
            }

        }
        return str1.substring(0, i);

    }

    public static void main(String[] args) {
        String[] str = { "fliwer", "fliw", "flight" };
        System.out.println(longprefix(str));
    }
}
