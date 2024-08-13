package Arrays;
public class range_sum {
    int prefix_sum[];

    public range_sum(int[] nums) {
        prefix_sum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            prefix_sum[i] = i == 0 ? nums[i] : prefix_sum[i - 1] + nums[i];
        }

    }

    public int sumRange(int left, int right) {
        if (left == 0)
            return prefix_sum[right];
        return prefix_sum[right] - prefix_sum[left - 1];
    }

    public static void main(String[] args) {
        int nums[] = { 2, 3, 1, 2, 1, 2, 3 };
        range_sum obj = new range_sum(nums);
        System.out.println(obj.sumRange(2, 5));

    }
}
