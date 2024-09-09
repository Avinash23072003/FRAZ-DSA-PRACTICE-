import java.util.*;
import java.io.*;

public class FloorCielSearch {
    public static int getFloor(int[] a, int n, int x) {
        // Wriute your code here.
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] <= x) {
                ans = a[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static int getCeil(int[] a, int n, int x) {
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] >= x) {
                ans = a[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int a[] = { 3, 4, 4, 7, 8, 10 };
        int n = a.length;
        int x = 2;
        System.out.println(getFloor(a, n, x));
        System.out.println(getCeil(a, n, x));
    }

}