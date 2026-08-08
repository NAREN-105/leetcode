class Solution {
    public int[] countOppositeParity(int[] nums) {
       int ans[]=new int[nums.length];
       for(int i=0;i<nums.length;i++)
       {
        ans[i]=cou(nums[i],nums,i);
       }
       return ans; 
    }
    public static int cou(int n, int arr[],int k)
    {
        int sum=0;
        boolean b=false;
        if(n%2==0)
        {
            b=true;
        }
        for(int i=k;i<arr.length;i++)
        {
            if(!b)
            {
            if(arr[i]%2==0)
            {
                sum++;
            }
            }
            else
            {
                if(arr[i]%2!=0)
            {
                sum++;
            } 
            }
        }
        System.out.println("sum :"+sum);
        return sum;
    }
}