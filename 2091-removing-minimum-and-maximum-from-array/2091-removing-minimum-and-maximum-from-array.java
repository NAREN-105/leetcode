class Solution {
    public int minimumDeletions(int[] nums) {
    if(nums.length<=1){
        return nums.length;
    }
    int max=nums[0],min=nums[0];
    int ind_max=0,ind_min=0;
    for(int i=0;i<nums.length;i++){
     if(nums[i]>max){
        max=nums[i];
        ind_max=i;
     }
     if(nums[i]<min){
        min=nums[i];
        ind_min=i;
     }
    }
    int ind_min1=Math.min(ind_min,ind_max);
    int ind_max1=Math.max(ind_min,ind_max);
    int op1=ind_max1+1;
    int op2=nums.length-ind_min1;
    int op3=(ind_min1+1)+(nums.length-ind_max1);
    return Math.min(op1,Math.min(op2,op3));    
    }
}