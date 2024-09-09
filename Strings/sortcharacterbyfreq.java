import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;

public class sortcharacterbyfreq {
    public static String freqsort(String str) {
        StringBuilder ans = new StringBuilder();
        Map<Character, Integer> HashM = new HashMap<>();
        for (char ch : str.toCharArray()) {
            HashM.put(ch, HashM.getOrDefault(ch, 0) + 1);

        }
        List<Character> list = new ArrayList<>(HashM.keySet());
        list.sort((a, b) -> HashM.get(b) - HashM.get(a));
        for (char ch : list) {
            for (int i = 0; i < HashM.get(ch); i++) {
                ans.append(ch);
            }
        }
        return ans.toString();

    }

    public static void main(String[] args) {
        String str = "treeaaaaabddsa";
        System.out.println(freqsort(str));
    }
}
