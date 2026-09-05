class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] prefMax = new int[n];
        int currentMax = nums[0];
        for (int i = 0; i < n; i++) {
            if (nums[i] > currentMax) {
                currentMax = nums[i];
            }
            prefMax[i] = currentMax;
        }
        int[] suffMin = new int[n];
        int currentMin = nums[n - 1];
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] < currentMin) {
                currentMin = nums[i];
            }
            suffMin[i] = currentMin;
        }
        for (int i = 0; i < n; i++) {
            long instabilityScore = (long) prefMax[i] - suffMin[i];
            if (instabilityScore <= k) {
                return i;
            }
        }
        
        return -1;
    }
}
