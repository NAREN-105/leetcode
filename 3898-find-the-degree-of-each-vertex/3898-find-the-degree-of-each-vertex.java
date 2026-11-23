class Solution {
    public int[] findDegrees(int[][] matrix) {
     int ans[]=new int[matrix.length];
     int k=0;
     for(int i=0;i<matrix[0].length;i++)
     {
        int count=0;
        for(int j=0;j<matrix.length;j++){
            if(matrix[i][j]==1)
            {
                count++;
            }
        }
        ans[k++]=count;
     }
     return ans;   
    }
}