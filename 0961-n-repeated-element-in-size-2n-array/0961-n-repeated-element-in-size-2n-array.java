class Solution {
    public int repeatedNTimes(int[] nums) {
    Map<Integer,Integer>m=new HashMap<>();
    for(int i:nums){
        m.put(i,m.getOrDefault(i,0)+1);
    }  
    int max=0;
    int key=0;
    for(int i:m.keySet()){
        if(m.get(i)>max){
            max=m.get(i);
            key=i;
        }
    }
    return key;  
    }
}