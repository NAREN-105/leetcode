class Solution {
    public boolean uniqueOccurrences(int[] arr) {

    Map<Integer,Integer> m=new HashMap<>();
    for(int i:arr)
    {
        m.put(i,m.getOrDefault(i,0)+1);
    }
    ArrayList<Integer>as=new ArrayList<>();   
    for(int i:m.keySet())
    {
        as.add(m.get(i));
    }
    for(int i=0;i<as.size();i++)
    {
        for(int j=i+1;j<as.size();j++)
        {
        if(as.get(i).equals(as.get(j)))
        {
        return false;        
        }
        }
    }
    return true;
    }
}