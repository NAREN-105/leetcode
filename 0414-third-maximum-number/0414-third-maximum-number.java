class Solution {
    public int thirdMax(int[] nums) {
     Set<Integer>s=new HashSet<>();
     for(int i:nums)
     {
        s.add(i);
     }
     ArrayList<Integer>as=new ArrayList<>(s);    
     Collections.sort(as);
     if(as.size()<3)
     {
     return as.get(as.size()-1);   
     }
     return as.get(as.size()-3);
    }
}