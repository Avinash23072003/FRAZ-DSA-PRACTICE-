package Arrays;
import java.util.Arrays;

class twosum {
    public static int[] twoSum(int n, int[] nums, int target) {
        Arrays.sort(nums);
        int ans[] = new int[2];
        ans[0] = ans[1] = -1;
        int left = 0, right = n - 1;
        int sum = 0;
        while (left < right) {
            sum = nums[left] + nums[right];
            if (sum == target) {
                ans[0] = left;
                ans[1] = right;
                return ans;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int target = 6;
        int nums[] = { 2, 4, 1, 9, 3, 1, 3 };
        int n = nums.length;

        int ans[] = twoSum(n, nums, target);
        System.out.println(ans[0] + " " + ans[1]);

    }
}
