package Arrays;
class missingNum {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int missingNum = -1;
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int num : nums) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                missingNum = i;
            }

        }
        return missingNum;
    }

    public static void main(String[] args) {
        int nums[] = { 0, 1, 3, 4, 5, 8, 10 };
        System.out.println(missingNumber(nums));
    }
}