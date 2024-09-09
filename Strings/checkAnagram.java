public class checkAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return true;
        } else {
            int count[] = new int[26];

            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++;
            }
            for (int i = 0; i < t.length(); i++) {
                count[t.charAt(i) - 'a']--;
            }

            for (int i = 0; i < count.length; i++) {
                if (count[i] != 0) {
                    return false;
                }

            }

        }
        return true;

    }

    public static void main(String[] args) {
        String s = "bat";
        String t = "cat";
        String str = "amey";
        for (int i = 0; i < s.length(); i++) {
            System.out.println(str.charAt(i) - 'a');
        }
        System.out.println(isAnagram(s, t));
    }
}
