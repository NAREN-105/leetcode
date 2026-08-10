class Solution {
    public String reversePrefix(String s, int k) {
    String str1=s.substring(0,k);
    StringBuilder sb=new StringBuilder(str1);
    String str2=s.substring(k,s.length());
    return sb.reverse().toString()+str2; 
    }  
}