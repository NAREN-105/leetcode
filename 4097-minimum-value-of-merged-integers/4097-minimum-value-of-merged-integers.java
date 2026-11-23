class Solution {
    public int minMergedInteger(int[] nums) {
    int min=Integer.MAX_VALUE;
    ArrayList<Integer>as=new ArrayList<>();
    for(int i=0;i<nums.length-1;i+=2)
    {
     String append=String.valueOf(nums[i])+String.valueOf(nums[i+1]);
     as.add(Integer.valueOf(append));
    }
    for(int i:as)
    {
        min=Math.min(min,i);
    }
    return min;    
    }
}