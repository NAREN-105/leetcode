class Solution {
    public int[] sumZero(int n) {
     ArrayList<Integer>as=new ArrayList<>();
     if(n<=1)
     {
        return new int[]{0};
     }
     if(n%2!=0)
     {
        as.add(0);
     }
     for(int i=1;i<=n/2;i++){
        as.add(i);
        as.add(-i);
     }
     int arr[]=new int[n];
     int k=0;
     for(int i:as){
        arr[k++]=i;
     }
     return arr;      
    }
}