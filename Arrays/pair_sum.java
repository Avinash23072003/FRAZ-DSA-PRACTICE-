package Arrays;

public class pair_sum {
    public static boolean find(int arr[], int n, int x) {
        int my_memory[] = new int[1001];
        for (int i = 0; i < n; i++) {
            int cur_num = arr[i];
            int req_num = x - cur_num;
            if (req_num <= 1000 && req_num > 0 && my_memory[req_num] == 1) {
                return true;
            }
            my_memory[cur_num] = 1;
        }
        return false;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 2, 4, 5, 4 };
        int n = arr.length;
        int x = 10;
        System.out.println(find(arr, n, x));
    }
}