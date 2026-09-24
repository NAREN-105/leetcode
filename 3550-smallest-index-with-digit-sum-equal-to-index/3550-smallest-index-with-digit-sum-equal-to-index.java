class Solution {
    public int smallestIndex(int[] nums) {
    for(int i=0;i<nums.length;i++){
        int val=sum(nums,i);
        if(val==i){
            return i;
        }
    }
    return -1;
    }
    
    public static int sum(int arr[],int n){
        int sum=0;
        int val=arr[n];
            while(val>0)
            {
            sum+=val%10;
            val/=10;
            }
        return sum==0?val:sum;
    }
}