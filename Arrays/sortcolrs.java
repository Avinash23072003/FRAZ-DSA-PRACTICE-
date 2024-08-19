package Arrays;

public class sortcolrs {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int l = 0;
        int m = 0;
        int h = n - 1;
        int temp;
        while (m <= h) {
            if (nums[m] == 0) {
                temp = nums[l];
                nums[l] = nums[m];
                nums[m] = temp;
                l++;
                m++;
            } else if (nums[m] == 1) {
                m++;
            } else {
                temp = nums[h];
                nums[h] = nums[m];
                nums[m] = temp;
                h--;
            }
        }
    }
}
