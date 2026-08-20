class Solution {
    public int[] resultArray(int[] nums) {
    ArrayList<Integer>as=new ArrayList<>();
    ArrayList<Integer>as1=new ArrayList<>();
    as.add(nums[0]);
    as1.add(nums[1]);
    for(int i=2;i<nums.length;i++){
        if(as.get(as.size()-1)>as1.get(as1.size()-1)){
            as.add(nums[i]);
        }
        else{
            as1.add(nums[i]);
        }
    }
    as.addAll(as1);
    for(int i=0;i<nums.length;i++){
        nums[i]=as.get(i);
    }
    return nums;
}
}