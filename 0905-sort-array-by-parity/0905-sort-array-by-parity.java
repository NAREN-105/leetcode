class Solution {
    public int[] sortArrayByParity(int[] nums) {
    if(nums.length<=1){
        return nums;
    }
    ArrayList<Integer>e=new ArrayList<>();
    ArrayList<Integer>o=new ArrayList<>();
    for(int i:nums){
        if(i%2==0) e.add(i);
        else o.add(i);
    }   
    e.addAll(o);
    int ans[]=new int[e.size()];
    int j=0;
    for(int i:e){
        ans[j++]=i;
    }
    return ans; 
    }
}