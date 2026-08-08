class Solution {
    public int findLucky(int[] arr) {
    ArrayList<Integer>as =new ArrayList<>();    
    Map<Integer,Integer> m=new HashMap<>();
    for(int i:arr)
    {
        m.put(i,m.getOrDefault(i,0)+1);
    }  
    for(int i:m.keySet())
    {
        if(i==m.get(i))
        {
            as.add(i);
        }
    }
    if(as.isEmpty())
    {
        return -1;
    }
    if(as.size()>1)
    {
        return as.get(as.size()-1);
    }
    return as.get(0);
    }
}