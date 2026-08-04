class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
    Map<Integer,Integer> m=new HashMap<>();
    for(int i:nums)
    {
        m.put(i,m.getOrDefault(i,0)+1);
    }
    int sum=0;
    for(int i:m.keySet())
    {
        int val=m.get(i);
        if(val>=k&&val%k==0)
        {
        sum+=i*val;
        }
    }
     return sum;    
    }
   
}