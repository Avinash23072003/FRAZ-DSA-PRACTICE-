import java.util.Arrays;

public class reverseword {
    public static String revWords(String str) {
        StringBuilder ans = new StringBuilder();
        String[] words = str.split(" +");
        for (int i = words.length - 1; i >= 0; i--) {
            ans.append(words[i]);
            ans.append(" ");
        }
        return ans.toString().trim();

    }

    public static void main(String[] args) {
        String str = "The    sky is blue";
        System.out.println(revWords(str));
    }
}
