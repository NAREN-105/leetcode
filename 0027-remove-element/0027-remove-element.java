class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==val)
            {
                continue;
            }
            else
            {
                nums[k++]=nums[i];
                sum++;
            }
        }
        return sum;
        
    }
}