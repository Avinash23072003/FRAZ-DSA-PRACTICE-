package Strings;

import java.util.Scanner;

class string2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = Integer.toString(N);

        int str1 = str.charAt(0) - '0';
        int str2 = str.charAt(str.length() - 1) - '0';
        int sum = str1 + str2;

        System.out.println(sum);
    }
}