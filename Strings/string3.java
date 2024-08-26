
public class string3 {
    public static void main(String[] args) {
        String str = "zxcvcvzx";
        String result = mostfre(str);
        System.out.println(result);
    }

    public static String mostfre(String str) {
        int freq = 0;
        char ans = '\0';
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int id = 0; id < str.length(); id++) {

                if (str.charAt(id) == ch) {
                    count++;
                }

            }
            if (count > freq) {
                freq = count;
                ans = ch;

            }

        }
        return Character.toString(ans);

    }
}