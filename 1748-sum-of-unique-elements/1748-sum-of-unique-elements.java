class Solution {
    public int sumOfUnique(int[] nums) {
    Map<Integer,Integer>m=new HashMap<>();
    for(int i:nums){
        m.put(i,m.getOrDefault(i,0)+1);
    } 
    int sum=0;
    for(int i:m.keySet()){
        if(m.get(i)==1){
           sum+=i;
        }
    } 
    return sum;
    }
}