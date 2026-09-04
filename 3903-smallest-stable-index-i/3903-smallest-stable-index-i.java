public class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] leftMax = new int[n];
        int curMax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            curMax = Math.max(curMax, nums[i]);
            leftMax[i] = curMax;
        }
        int[] rightMin = new int[n];
        int curMin = Integer.MAX_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            curMin = Math.min(curMin, nums[i]);
            rightMin[i] = curMin;
        }
        for (int i = 0; i < n; i++) {
            if (leftMax[i] - rightMin[i] <= k) {
                return i;
            }
        }
        
        return -1;
    }
}
