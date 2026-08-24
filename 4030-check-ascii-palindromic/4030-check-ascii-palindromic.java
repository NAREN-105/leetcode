class Solution {
    public boolean isPalindromic(String s) {
    String str="";
    for(char ch:s.toCharArray()){
        int val=(int )ch;
        str+=String.format("%8s",Integer.toBinaryString(val)).replace(' ','0');
    }   
    StringBuilder sb=new StringBuilder(str);
    return str.equals(sb.reverse().toString());
    }
}