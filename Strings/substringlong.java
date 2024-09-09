import java.util.Arrays;

class substringlong {
    public static int sub(String str) {
        int[] hash = new int[256]; // Declare the array with 256 elements
        Arrays.fill(hash, -1);
        int l = 0, r = 0, maxlen = 0;
        int n = str.length();

        while (r < n) {
            if (hash[str.charAt(r)] != -1) {
                if (hash[str.charAt(r)] >= l) {
                    l = hash[str.charAt(r)] + 1;
                }
            }
            int len = r - l + 1;
            maxlen = Math.max(maxlen, len);
            hash[str.charAt(r)] = r;
            r++;
        }

        return maxlen;
    }

    public static void main(String[] args) {
        String str = "cadbzabcd";
        // int result = sub(str);
        System.out.println(sub(str));
    }
}
