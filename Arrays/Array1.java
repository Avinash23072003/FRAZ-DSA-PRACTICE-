package Arrays;
import java.util.Scanner;
import java.util.Arrays;

class Array1 {

    public static void main(String[] args) {
        int[] arr1 = new int[10];

        arr1[0] = 43;
        arr1[1] = 45;
        arr1[4] = 90;
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        int[] arr2 = { 23, 43, 12, 35 };
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        Arrays.fill(arr2, 5);
        System.out.println(Arrays.toString(arr2));

        int arr3[] = arr2;
        arr2[0] = 28;
        System.out.println(Arrays.toString(arr2));

    }

}
