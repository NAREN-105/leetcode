class Solution {
    public int returnToBoundaryCount(int[] nums) {
       int sum=nums[0];
       int in_co=0;
       for(int i=1;i<nums.length;i++){
        sum+=nums[i];
        if(sum==0){
            in_co++;
        }
       }
       return in_co; 
    }
}