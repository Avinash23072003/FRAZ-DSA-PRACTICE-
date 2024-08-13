package Arrays;
public class ksum {
    public static long[] merge(long arr1[], long arr2[], int n, int m) {
        long arr3[] = new long[n + m];
        int i = 0, j = 0, k = 0;

        // Traverse both arrays and copy the smaller element to arr3
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr1, if any
        while (i < n) {
            arr3[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2, if any
        while (j < m) {
            arr3[k++] = arr2[j++];
        }

        return arr3;
    }

    public static void main(String args[]) {
        long arr1[] = { 1, 2, 3, 1, 2, 1, 1, 1 };
        int n = 8;
        long arr2[] = { 2, 3, 1, 2, 3, 33, 3 };
        int m = 7;
        System.out.println(merge(arr1, arr2, n, m));

    }

}
