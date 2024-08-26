public class parenthesis {

    public static String ans(String str, int count) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                if (count > 0) {
                    ans.append('(');
                }
                count++;
            } else if (str.charAt(i) == ')') {
                count--;
                if (count > 0) {
                    ans.append(')');
                }

            }
        }
        return ans.toString();
    }

    public static void main(String args[]) {
        String str = "(()()) (())";
        System.out.println(ans(str, 0));
    }
}
