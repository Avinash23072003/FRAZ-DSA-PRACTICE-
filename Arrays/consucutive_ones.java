package Arrays;
import java.util.*;
import java.util.Arrays;

public class consucutive_ones {

    public static int conscutive_ones(int arr[]) {
        int n = arr.length;
        int cur_num = 0, final_ans = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                cur_num = cur_num + 1;
            } else {
                cur_num = 0;
            }
            final_ans = Math.max(final_ans, cur_num);
        }
        return final_ans;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1 };
        System.out.println(conscutive_ones(arr));
    }
}
