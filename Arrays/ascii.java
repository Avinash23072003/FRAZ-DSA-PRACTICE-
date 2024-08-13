package Arrays;
public class ascii {
    public static void main(String[] args) {

        String str = "abcdABCD";
        for (int i = 0; i < str.length(); i++) {
            int ascino = str.charAt(i);
            System.out.print(ascino + " ");
        }

    }
}