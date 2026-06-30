class Solution {
    public int lengthOfLongestSubstring(String s) {
    char arr[]=s.toCharArray();
    HashSet<Character> hs=new HashSet<>();
    int lef=0;
    int max=0;
    for(int right=0;right<arr.length;right++)
    {
     char ch=arr[right];
     while(hs.contains(ch))
     {
        hs.remove(arr[lef]);
        lef++;
     }
     hs.add(arr[right]);
    max=Math.max(max,hs.size());
    }
   
    return max;
    }
}