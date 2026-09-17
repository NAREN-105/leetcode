import java.util.Arrays;

class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int[] minLen = new int[n];
        Arrays.fill(minLen, Integer.MAX_VALUE / 2);
        
        int ans = Integer.MAX_VALUE;
        int windowSum = 0;
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            windowSum += arr[right];
            
            while (windowSum > target && left <= right) {
                windowSum -= arr[left];
                left++;
            }
            
            if (windowSum == target) {
                int currentLen = right - left + 1;
                
                
                if (left > 0) {
                    ans = Math.min(ans, currentLen + minLen[left - 1]);
                }
                
                
                if (right > 0) {
                    minLen[right] = Math.min(minLen[right - 1], currentLen);
                } else {
                    minLen[right] = currentLen;
                }
            } else {
               
                if (right > 0) {
                    minLen[right] = minLen[right - 1];
                }
            }
        }
        
        return ans >= Integer.MAX_VALUE / 2 ? -1 : ans;
    }
}
