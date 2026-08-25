class Solution {
    public int missingMultiple(int[] nums, int k) {
    Set<Integer> s=new HashSet<>();
    for(int i:nums)
    {
        if(i%k==0)
        {
            s.add(i);
        }
    }
    ArrayList<Integer>as=new ArrayList<>();
    for(int i:s)
    {
    as.add(i);
    }    
    Collections.sort(as);
    int l=0;
    for(int i=k; ;i+=k)
    {
        if(l>=as.size()){
            return i;
        }
        if(as.get(l)!=i)
        {
            return i;
        }
       l++;
    }
    //return 0;
    }
}