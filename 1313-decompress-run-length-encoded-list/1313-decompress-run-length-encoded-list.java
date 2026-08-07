class Solution {
    public int[] decompressRLElist(int[] nums) {
     ArrayList<Integer> as=new ArrayList<>();
     for(int i=0;i<nums.length;i+=2)
     {
        int freq=nums[i];
        int ele=nums[i+1];
        for(int j=1;j<=freq;j++)
        {
            as.add(ele);
        }
     }
     int ans[]=new int[as.size()];
     int k=0;
     for(int i:as)
     {
        ans[k++]=i;
     }
     return ans;   
    } 
}