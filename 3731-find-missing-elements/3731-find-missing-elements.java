class Solution {
    public List<Integer> findMissingElements(int[] nums) {
    ArrayList<Integer> as=new ArrayList<>();
    HashSet<Integer>hs=new HashSet<>();
    for(int i:nums){
        hs.add(i);
    }
    ArrayList<Integer> as1=new ArrayList<>();
    for(int i:hs)
    {
        as1.add(i);
    }
    Collections.sort(as1);
     int st=as1.get(0);
    int end=as1.get(as1.size()-1);
    for(int i=st;i<end;i++)
    {
     if(!hs.contains(i))
     {
        as.add(i);
     }
    }
    return as;    
    }
}