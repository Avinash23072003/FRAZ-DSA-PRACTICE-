package Arrays;
public class con_ones3 {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int l = 0, ans = 0, zero_count = 0;
        for (int r = 0; r < n; r++) {
            if (nums[r] == 0) {
                zero_count++;
            }
            while (zero_count > k) {
                if (nums[l] == 0) {
                    zero_count--;
                }
                l++;
            }
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
}