class Solution {
    public int[] sortEvenOdd(int[] nums) {
    if(nums.length<=2){
        return nums;
    }    
    ArrayList<Integer>e=new ArrayList<>();
    ArrayList<Integer>o=new ArrayList<>();
    for(int i=0;i<nums.length;i++)
    {
        if(i%2==0) e.add(nums[i]);
        else o.add(nums[i]);
    }
    Collections.sort(e);
Collections.sort(o,Collections.reverseOrder());
    int ev=0;
    int od=0;
    for(int i=0;i<nums.length;i++){
        if(i%2==0)
        {
        nums[i]=e.get(ev);
        ev++;
        }
        else
        { 
        nums[i]=o.get(od);
        od++;
        }
    }
    return nums;
    }
}