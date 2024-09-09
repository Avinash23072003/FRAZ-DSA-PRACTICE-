public class FirstlastOccurance {
    public static int first(int arr[], int n, int k) {
        int start = 0;
        int end = n - 1;
        int result = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == k) {
                result = mid;
                end = mid - 1;
            } else if (arr[mid] > k) {
                end = mid - 1;

            } else if (arr[mid] < k) {
                start = mid + 1;
            }
        }
        return result;

    }

    public static int second(int arr[], int n, int k) {
        int start = 0;
        int end = n - 1;
        int result = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == k) {
                result = mid;
                start = mid + 1;
            } else if (arr[mid] > k) {
                end = mid - 1;

            } else if (arr[mid] < k) {
                start = mid + 1;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 6, 6, 7, 7, 7, 10, 34 };
        int n = arr.length;
        int k = 7;
        int[] result = new int[2];
        result[0] = first(arr, n, k);
        result[1] = second(arr, n, k);
        int occur = result[1] - result[0] + 1;
        for (int value : result) {
            System.out.print(value + " ");
        }
        System.out.println(occur);

    }
}
