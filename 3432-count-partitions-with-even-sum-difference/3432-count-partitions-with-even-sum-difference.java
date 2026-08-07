class Solution {
    public int countPartitions(int[] nums) {
        int ele=nums[0];
        int count=0;
        for(int i=1;i<nums.length;i++)
        {
            int val=find(i,nums);
            int dif=ele-val;
            if(dif%2==0)
            {
                count++;
            }
            ele+=nums[i];
        }
        return count;
    }
    public static int find(int n,int nums[])
    {
        int sum=0;
        for(int i=n;i<nums.length;i++)
        {
        sum+=nums[i];
        }
        return sum;
    }
}