class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
    Map<Integer,Integer> m=new HashMap<>();
    for(int i:nums)
    {
        m.put(i,m.getOrDefault(i,0)+1);
    }
    for(int i:m.keySet())
    {
        if(i==nums[nums.length/2]&&m.get(i)==1)
        {
            return true;
        }
    }
    return false;
    }
}