import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        
        Map<Integer, Integer> rowMasks = new HashMap<>();
        
        for (int[] seat : reservedSeats) {
            int row = seat[0];
            int col = seat[1];
           
            if (col >= 2 && col <= 9) {
               
                rowMasks.put(row, rowMasks.getOrDefault(row, 0) | (1 << col));
            }
        }
        
        
        int maxGroups = 2 * n;
        
        
        int leftMask = (1 << 2) | (1 << 3) | (1 << 4) | (1 << 5);
       
        int rightMask = (1 << 6) | (1 << 7) | (1 << 8) | (1 << 9);
       
        int midMask = (1 << 4) | (1 << 5) | (1 << 6) | (1 << 7);
        
        
        for (int mask : rowMasks.values()) {
            boolean leftFree = (mask & leftMask) == 0;
            boolean rightFree = (mask & rightMask) == 0;
            
            if (leftFree && rightFree) {
                
                continue;
            } else if (leftFree || rightFree || (mask & midMask) == 0) {
                
                maxGroups -= 1;
            } else {
                
                maxGroups -= 2;
            }
        }
        
        return maxGroups;
    }
}
