class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }
        ArrayList<Integer> o = new ArrayList<>();
        ArrayList<Integer> e = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0)
                e.add(nums[i]);
            else
                o.add(nums[i]);
        }
        int k = 0, l = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = e.get(k);
                k++;
            } else {
                nums[i] = o.get(l);
                l++;
            }
        }
        return nums;
    }
}