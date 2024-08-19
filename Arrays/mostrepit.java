package Arrays;

public class mostrepit {
    public static void main(String[] args) {
        int freq[] = new int[256];
        String str = "abbsca";

        // first convert the char into ascii and then store into arra freq;
        for (int i = 0; i < str.length(); i++) {
            int id = str.charAt(i);
            freq[id]++;
        }

        // now we have to find max char that we have store into our array;
        int max_id = -1;
        int max_freq = -1;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > max_freq) {
                max_freq = freq[i];
                max_id = i;
            }

        }
        System.out.println((char) max_id);
    }
}
