class Solution {
    public int maxProduct(int n) {
        int max=0;
        int prod=1;
        int val=n;
        int count=0;
        while(val>0)
        {
            int dig=val%10;
            if(dig>max)
            {
                max=dig;
            }
            count++;
            val/=10;
        }
        int arr[]=new int[count];
        int i=0;
        while(n>0)
        {
            int dig=n%10;
            if(dig>max)
            {
                max=dig;
            }
            arr[i++]=dig;
            n/=10;
        }
        Arrays.sort(arr);
        return arr[arr.length-2]*arr[arr.length-1];
    }
}