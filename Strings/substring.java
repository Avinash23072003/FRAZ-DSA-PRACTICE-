public class substring {
    public static void main(String[] args) {
        // String str = "Physics";
        // for (int j = 2; j < 4; j++) {
        // System.out.println(str.substring(j));
        // }
        String str = "abcd";
        for (int i = 0; i <= 3; i++) {
            for (int j = i + 1; j <= 3; j++) {
                System.out.print(str.substring(i, j) + " ");
            }
        }

    }
}
