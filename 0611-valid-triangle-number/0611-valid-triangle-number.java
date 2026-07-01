import java.util.*;

class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n ; i++) {
            for (int j = i + 1; j <= n - 2; j++) {
                for (int k = j + 1; k <= n-1; k++) {
                    if (nums[i] + nums[j] > nums[k]) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}