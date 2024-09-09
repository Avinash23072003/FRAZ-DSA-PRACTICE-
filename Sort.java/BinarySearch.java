public class BinarySearch {
    public static int BinaryS(int arr[], int target) {
        int start = 0;
        int n = arr.length;
        int end = n - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 9, 12, 23, 34, 48, 59, 62 };
        int target = 48;
        System.out.println(BinaryS(arr, target));

    }
}