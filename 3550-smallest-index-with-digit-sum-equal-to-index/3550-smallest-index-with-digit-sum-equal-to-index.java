class Solution {
    public int smallestIndex(int[] nums) {
    for(int i=0;i<nums.length;i++)
    {
        int val=nums[i];
        int sum=0;
        if(val>9)
        {
            while(val>0)
            {
            int dig=val%10;
            sum+=dig;
            val/=10;
            }
            if(sum==i)
            {
             return i;
            }
        }
        else
        {
            if(val==i)
            {
                return val;
            }
        }
       // System.out.println("i :"+nums[i]+" sum :"+sum);
    }
    return -1;
    }
    
}