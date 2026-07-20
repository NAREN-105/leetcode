class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
      int arr[]=new int[grid[0].length*grid.length];
      int l=0;
      for(int i=0;i<grid.length;i++)
      {
        for(int j=0;j<grid[0].length;j++)
        {
            arr[l++]=grid[i][j];
        }
      }
    //  k=k%arr.length;
         for(int j=0;j<k;j++)
      {
      int tmep=arr[arr.length-1];
       for(int i=arr.length-1;i>0;i--)
        {
        arr[i]=arr[i-1]; 
        }
        arr[0]=tmep;
      }
      List<List<Integer>> as1=new ArrayList<>();
     List<Integer> as2 = new ArrayList<>();
for(int i : arr)
{
    as2.add(i);

    if(as2.size() == grid[0].length)
    {
        as1.add(as2);
        as2 = new ArrayList<>();
    }
}
   return as1;
}
}