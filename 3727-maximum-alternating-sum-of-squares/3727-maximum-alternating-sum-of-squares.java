import java.util.Arrays;

public class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] squares = new long[n];
        
        // Step 1: Calculate the square of each number
        for (int i = 0; i < n; i++) {
            squares[i] = (long) nums[i] * nums[i];
        }
        Arrays.sort(squares);
        long totalScore = 0;
        int negativeCount = n / 2; 
        
        for (int i = 0; i < n; i++) {
            if (i < negativeCount) {
                totalScore -= squares[i];
            } else {
                totalScore += squares[i];
            }
        }
        
        return totalScore;
    }
}
