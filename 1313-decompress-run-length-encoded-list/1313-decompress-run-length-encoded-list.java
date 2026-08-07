class Solution {
    public int[] decompressRLElist(int[] nums) {
     ArrayList<Integer> as=new ArrayList<>();
     for(int i=0;i<nums.length;i+=2)
     {
        int freq=nums[i];
        int ele=nums[i+1];
        int j=1;
        while(j<=freq){
            as.add(ele);
            j++;
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