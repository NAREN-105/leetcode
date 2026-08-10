class Solution {
    public int alternatingSum(int[] nums) {
    ArrayList<Integer>ev=new ArrayList<>();
    ArrayList<Integer>od=new ArrayList<>();
    for(int i=0;i<nums.length;i+=2)
    {
        ev.add(nums[i]);
    }
    for(int i=1;i<nums.length;i+=2)
    {
        od.add(nums[i]);
    }
    int sum=0;
    int sum1=0;
    for(int i:ev)
    {
    sum+=i;
    }
    for(int i:od)
    {
        sum1+=i;
    }
    return sum-sum1;
    }
}