import java.util.ArrayList;

class subsequence {
    // public static ArrayList<String> subarray(String str) {

    // ArrayList<String> ans = new ArrayList<>();
    // // base case
    // if (str.length() == 0) {
    // ans.add("");
    // return ans;
    // }

    // char ch = str.charAt(0);
    // ArrayList<String> smallans = subarray(str.substring(1));
    // for (String ss : smallans) {
    // ans.add(ch + ss);
    // ans.add(ss);

    // }
    // return ans;

    // }

    public static void ssq(String str, String currans) {
        if (str.length() == 0) {
            System.out.println(currans);
        } else {
            char ch = str.charAt(0);
            String remainString = str.substring(1);
            ssq(remainString, currans + ch);
            ssq(remainString, currans);
        }

    }

    public static void main(String[] args) {
        String str = "abc";
        String currans = "";
        ssq(str, currans);

        // ArrayList<String> ans = subarray(str);
        // for (String ss : ans) {
        // System.out.println(ss);
        // }

    }
}