class Solution {
    public int getLeastFrequentDigit(int n) {
        String ans=String.valueOf(n);
        int arr[]=new int[ans.length()];
        int p=0;
        for(char ch:ans.toCharArray())
        {
            arr[p++]=ch-'0';
        }
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i:arr)
        {
            m.put(i,m.getOrDefault(i,0)+1);
        }
        int min=Integer.MAX_VALUE;
        for(int i:m.values())
        {
            min=Math.min(i,min);
        }
        int minKey=9;
        for(int k:m.keySet()){
              if(m.get(k)==min)
              {
               minKey=Math.min(minKey,k);
              }
        }
        return minKey;
    }
}