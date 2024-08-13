package Arrays;
class RotateArray {

    public static void rotate(int arr[], int n, int k) {
        k = k % n;

        if (n == 0) {
            return;
        }

        // copies last elt from original array to temp array
        int temp[] = new int[k];
        for (int i = n - k; i < n; i++) {
            temp[i - n + k] = arr[i];
        }
        // shift orignal array elt to rigth by k places
        for (int i = n - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }

        // add copied elts to originl array
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 24, 2, 1, 3, 56, 23, 12 };
        int n = arr.length;
        int k = 3;
        rotate(arr, n, k);

        for (int newArray : arr) {
            System.out.print(newArray + " ");
        }
    }
}