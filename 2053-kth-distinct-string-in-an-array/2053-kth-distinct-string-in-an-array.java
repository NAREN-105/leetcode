class Solution {
    public String kthDistinct(String[] arr, int k) {
    Map<String,Integer> m=new   LinkedHashMap<>();
    for(String ch:arr)
    {
        m.put(ch,m.getOrDefault(ch,0)+1);
    }
    int co=0;
    for(String st:m.keySet())
    {
    int val=m.get(st);
    if(val==1)
    {
        co++;
    }
    if(co==k)
    {
        return st;
    }
    }
    return "";
    }
}