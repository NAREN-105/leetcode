class Solution {
    public int removePalindromeSub(String s) {
       StringBuilder sb=new StringBuilder();
       for(int i=s.length()-1;i>=0;i--)
       {
        sb.append(s.charAt(i));
       } 
       if(s.equals(sb.toString()))
       {
        return 1;
       }
       return 2;
    }
}