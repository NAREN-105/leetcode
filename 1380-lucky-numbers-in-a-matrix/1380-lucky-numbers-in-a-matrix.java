import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> luckyNums = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        
         
        int[] minColIndices = new int[m];
        
       
        for (int i = 0; i < m; i++) {
            int minVal = matrix[i][0];
            int minColIdx = 0;
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] < minVal) {
                    minVal = matrix[i][j];
                    minColIdx = j;
                }
            }
            minColIndices[i] = minColIdx;
        }
        
        
        for (int i = 0; i < m; i++) {
            int targetCol = minColIndices[i];
            int candidate = matrix[i][targetCol];
            boolean isMaxInCol = true;
            
            for (int k = 0; k < m; k++) {
                if (matrix[k][targetCol] > candidate) {
                    isMaxInCol = false;
                    break;
                }
            }
            
            if (isMaxInCol) {
                luckyNums.add(candidate);
            }
        }
        
        return luckyNums;
    }
}
