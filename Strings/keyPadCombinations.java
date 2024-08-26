public class keyPadCombinations {
    public static void keypad(String str, String[] kp, String res) {
        if (str.length() == 0) {
            System.out.print(res + " ");
            return;
        }
        int currNum = str.charAt(0) - '0'; // 2 converts string into integer
        String currChoices = kp[currNum]; // 253

        for (int i = 0; i < currChoices.length(); i++) {
            keypad(str.substring(1), kp, res + currChoices.charAt(i));
        }

    }

    public static void main(String[] args) {
        String str = "53";
        String[] kp = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        keypad(str, kp, "");
    }
}
