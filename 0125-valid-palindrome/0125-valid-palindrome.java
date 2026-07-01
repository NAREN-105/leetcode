class Solution {
    public boolean isPalindrome(String s) {
     s=s.toLowerCase();
     s=s.strip().trim();
     StringBuilder sb=new StringBuilder();
     for(char ch:s.toCharArray())
     {
        if(Character.isLetterOrDigit(ch))
        {
        sb.append(ch);
        }
     }   
     String or=sb.toString();
     String rev=sb.reverse().toString();
     return or.equals(rev);
    }
}