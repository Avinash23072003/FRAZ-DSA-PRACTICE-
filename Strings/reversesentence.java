import java.util.Arrays;

public class reversesentence {

    public static String reverseWords(String s) {
        String[] word = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = word.length - 1; i >= 0; i--) {
            sb.append(word[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String s = "   hello! world";
        // String[] words = s.split("+");
        // System.out.println(Arrays.toString(words));
        System.out.println(reverseWords(s));
    }
}