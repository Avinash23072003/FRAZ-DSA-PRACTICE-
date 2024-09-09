public class oddString {
    public static String odd(String str) {
        int n = str.length() - 1;
        for (int i = n; i >= 0; i--) {
            int digit = str.charAt(i) - '0';
            if (digit % 2 != 0) {
                return str.substring(0, i + 1);
            }
        }
        return " ";
    }

    public static void main(String[] args) {
        String str = "4206";
        System.out.println(odd(str));

    }
}
