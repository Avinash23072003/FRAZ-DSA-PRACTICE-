package Function;

import java.util.Scanner;

public class numbers1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        /*
         * for(int i=1;i<=n;i++){
         * if(i%7==0 && i%2==0){
         * System.out.println(i);
         * }
         * }
         */

        for (int i = 4; i <= n; i = i + 4) {
            System.out.println(i);
        }

    }
}