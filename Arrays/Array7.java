package Arrays;
public class Array7 {
    public static void main(String args[]) {
        int arr[][] = { { 1, 3 },
                { 5, -3, 54, 32, 54, },
                { 10, -43, 54 } };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(arr[0][1]);

        int crr[][] = { { 2, 4, 3 },
                { 5, 4, 90 },
                { 3, 96, 43 }
        };

        for (int j = 0; j < crr.length; j++) {
            for (int i = 0; i < crr.length; i++) {
                System.out.print(crr[i][j] + " ");
            }
            System.out.println();
        }
    }
}