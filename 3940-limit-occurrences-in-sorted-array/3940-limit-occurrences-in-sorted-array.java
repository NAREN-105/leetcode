class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
    ArrayList<Integer>as=new ArrayList<>();
    Map<Integer,Integer> m=new HashMap<>();
    for(int i:nums)
    {
        m.put(i,m.getOrDefault(i,0)+1);
    }
    for(int i:m.keySet())
    {

        if(m.get(i)>=k)
        {
            for(int j=1;j<=k;j++)
            {
                as.add(i);
            }
        }
        else
        {
            if(m.get(i)<=k)
            {
                for(int l=1;l<=m.get(i);l++)
                {
                    as.add(i);
                }
            }
        }
    }
    Collections.sort(as);
    int ans[]=new int[as.size()];
    int p=0;
    for(int i:as)
    {
        ans[p++]=i;
    }
    return ans;
    }
}