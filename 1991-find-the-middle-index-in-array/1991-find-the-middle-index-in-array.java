class Solution {
    public int findMiddleIndex(int[] nums) {
        if (nums.length <= 1) {
            return 0;
        }
        int leftind = 0;
        for (int i = 0; i < nums.length; i++) {
            int l_sum = 0;
            int r_sum = 0;
            for (int j = i; j >= 0; j--) {
                l_sum += nums[j];
            }
            for (int k = i; k < nums.length; k++) {
                r_sum += nums[k];
            }
            if (l_sum == r_sum) {
                return i;
            }
        }
        return -1;
    }
}