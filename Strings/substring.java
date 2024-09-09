public class substring {
    public static void main(String[] args) {
        // String str = "Physics";
        // for (int j = 2; j < 4; j++) {
        // System.out.println(str.substring(j));
        // }
        String str = "abcd";
        int n = str.length();
        String sub;
        for (int i = 0; i < n; i++) {
            sub = "";
            for (int j = i; j < n; j++) {

                sub = sub + str.charAt(j);
                System.out.print(sub + " ");

            }

        }

    }
}
